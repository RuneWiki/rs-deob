import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class748 extends class723 {
   @OriginalMember(
      owner = "client!qr",
      name = "i",
      descriptor = "Ljava/net/ProxySelector;"
   )
   private ProxySelector field10928 = ProxySelector.getDefault();
   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10931 = new String[]{method5419(method5418("\u0007$V\u007f\u001b\b],\u001bA")), method5419(method5418("o8V{d\u0016B2\u000by\u0017\\")), method5419(method5418("W\u001emS2\n\rw_#B\u0002vB(F\u0018g\u0011k")), method5419(method5418("o8V{d\u0016B3\u000by\u0017\\")), method5419(method5418("o8V{d\u0016B2\u000b\u007f\u0017[")), method5419(method5418("\u0007$V\u007f\u001b\b],\u001bA-")), method5419(method5418("n?M\u0006s\u001fY;\u0006z")), method5419(method5418("d#Le\u000ed8\"")), method5419(method5418("o8V{d\u0016B3\u000b\u007f\u0017[")), method5419(method5418("-f")), method5419(method5418("M\rtJeI\tv\u0005\u001eu ")), method5419(method5418("@\tvc.F\bgY\u001dF\u0000wN")), method5419(method5418("O\u0018v[8")), method5419(method5418("\u001dL")), method5419(method5418("T\u0019r[$U\u0018q{9B\to[?N\u001agj>S\u0004mY\"]\rvB$I")), method5419(method5418("@\tv{9H\u0014{j>S\u0004")), method5419(method5418("M\rtJeK\rlLet\u0018pB%@")), method5419(method5418("O\u0018v[8\u001dC-")), method5419(method5418("T\u0019l\u0005%B\u0018,\\<PBrY$S\u0003aD'\t\u0004v_;\t-w_#B\u0002vB(F\u0018kD%n\u0002dD")), method5419(method5418("@\tvc.F\bgY\u0005F\u0001g")), method5419(method5418("\u001dC-")), method5419(method5418("S\u001ewN")), method5419(method5418("M\rtJeI\tv\u0005>T\tQR8S\to{9H\u0014kN8")), method5419(method5418("O\u0018v["))};
   @OriginalMember(
      owner = "client!qr",
      name = "j",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10929;
   @OriginalMember(
      owner = "client!qr",
      name = "h",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10930;

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(Z)Ljava/net/Socket;"
   )
   public final Socket method3794(boolean arg0) throws IOException {
      boolean var2 = Boolean.parseBoolean(System.getProperty(field10931[22]));
      if (!var2) {
         System.setProperty(field10931[22], field10931[21]);
      }

      boolean var3 = ~this.field10574 == -444;

      List var4;
      List var5;
      try {
         var4 = this.field10928.select(new URI((var3 ? field10931[12] : field10931[23]) + field10931[20] + this.field10569));
         var5 = this.field10928.select(new URI((!var3 ? field10931[12] : field10931[23]) + field10931[20] + this.field10569));
      } catch (URISyntaxException var18) {
         return this.method5243(50);
      }

      var4.addAll(var5);
      Object[] var7 = var4.toArray();
      class381 var8 = null;
      Object[] var9 = var7;

      for(int var10 = 0; ~var10 > ~var9.length; ++var10) {
         Object var11 = var9[var10];
         Proxy var12 = (Proxy)var11;

         try {
            Socket var13 = this.method5416(var12, true);
            if (var13 != null) {
               return var13;
            }
         } catch (class381 var16) {
            var8 = var16;
         } catch (IOException var17) {
         }
      }

      if (var8 == null) {
         if (!arg0) {
            this.field10928 = (ProxySelector)null;
         }

         return this.method5243(-124);
      } else {
         throw var8;
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "httpProxyConnect",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;"
   )
   private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
      Socket var4 = new Socket(arg0, arg1);
      var4.setSoTimeout(10000);
      OutputStream var5 = var4.getOutputStream();
      if (arg2 != null) {
         var5.write((field10931[7] + this.field10569 + ":" + this.field10574 + field10931[0] + arg2 + field10931[9]).getBytes(Charset.forName(field10931[6])));
      } else {
         var5.write((field10931[7] + this.field10569 + ":" + this.field10574 + field10931[5]).getBytes(Charset.forName(field10931[6])));
      }

      var5.flush();
      BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
      String var7 = var6.readLine();
      if (var7 != null) {
         if (var7.startsWith(field10931[1]) || var7.startsWith(field10931[3])) {
            return var4;
         }

         if (var7.startsWith(field10931[4]) || var7.startsWith(field10931[8])) {
            int var8 = 0;
            String var9 = field10931[2];
            String var10 = var6.readLine();

            while(var10 != null && ~var8 > -51) {
               if (var10.toLowerCase().startsWith(var9)) {
                  String var11 = var10.substring(var9.length()).trim();
                  int var12 = var11.indexOf(32);
                  if (~var12 != 0) {
                     var11 = var11.substring(0, var12);
                  }

                  throw new class381(var11);
               }

               var10 = var6.readLine();
               ++var8;
            }

            throw new class381("");
         }
      }

      var5.close();
      var6.close();
      var4.close();
      return null;
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(Ljava/net/Proxy;Z)Ljava/net/Socket;"
   )
   private final Socket method5416(Proxy arg0, boolean arg1) throws IOException {
      if (arg0.type() != Type.DIRECT) {
         SocketAddress var3 = arg0.address();
         if (!arg1) {
            return (Socket)null;
         } else if (!(var3 instanceof InetSocketAddress)) {
            return null;
         } else {
            InetSocketAddress var4 = (InetSocketAddress)var3;
            if (arg0.type() != Type.HTTP) {
               if (arg0.type() != Type.SOCKS) {
                  return null;
               } else {
                  Socket var5 = new Socket(arg0);
                  var5.connect(new InetSocketAddress(this.field10569, this.field10574));
                  return var5;
               }
            } else {
               String var6 = null;

               try {
                  Class var7 = Class.forName(field10931[18]);
                  Method var8 = var7.getDeclaredMethod(field10931[15], field10929 == null ? (field10929 = method5417(field10931[16])) : field10929, Integer.TYPE);
                  var8.setAccessible(true);
                  Object var9 = var8.invoke((Object)null, var4.getHostName(), new Integer(var4.getPort()));
                  if (var9 != null) {
                     Method var10 = var7.getDeclaredMethod(field10931[14]);
                     var10.setAccessible(true);
                     if ((Boolean)var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod(field10931[19]);
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod(field10931[11], field10930 == null ? (field10930 = method5417(field10931[10])) : field10930, field10929 == null ? (field10929 = method5417(field10931[16])) : field10929);
                        var12.setAccessible(true);
                        String var13 = (String)var11.invoke(var9);
                        String var14 = (String)var12.invoke(var9, new URL(field10931[17] + this.field10569 + "/"), field10931[12]);
                        var6 = var13 + field10931[13] + var14;
                     }
                  }
               } catch (Exception var16) {
               }

               return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
            }
         }
      } else {
         return this.method5243(-115);
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5417(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5418(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5419(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

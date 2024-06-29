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

@OriginalClass("client!gf")
public class class217 extends class334 {
   @OriginalMember(
      owner = "client!gf",
      name = "j",
      descriptor = "Ljava/net/ProxySelector;"
   )
   private ProxySelector field3273 = ProxySelector.getDefault();
   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3276 = new String[]{method1881(method1880("$\u007f\u0013]\u0010]\u0005v-\u000b\\\u001c")), method1881(method1880("%x\b \u0007T\u001e~ \u000e")), method1881(method1880("/d\tCz/\u007fg")), method1881(method1880("$\u007f\u0013]\u0010]\u0005v-\r\\\u001b")), method1881(method1880("f!")), method1881(method1880("Lc\u0013YoC\u001ai=5")), method1881(method1880("Lc\u0013YoC\u001ai=5f")), method1881(method1880("$\u007f\u0013]\u0010]\u0005w-\r\\\u001b")), method1881(method1880("$\u007f\u0013]\u0010]\u0005w-\u000b\\\u001c")), method1881(method1880("\u001cY(uFAJ2yW\tE3d\\\r_\"7\u001f")), method1881(method1880("\u000bN3EZ\rO\"\u007fq\rF\"")), method1881(method1880("\u001f^)#Q\t_izH\u001b\u00057\u007fP\u0018D$bSBC3yOBj2yW\tE3d\\\r_.bQ%E!b")), method1881(method1880("\u0004_3}L")), method1881(method1880("V\u000b")), method1881(method1880("\u0006J1l\u0011\u0000J)j\u0011?_5dQ\u000b")), method1881(method1880("\u0006J1l\u0011\u0002N3#j>g")), method1881(method1880("\u000bN3EZ\rO\"\u007fi\rG2h")), method1881(method1880("\u000bN3]M\u0003S>LJ\u0018C")), method1881(method1880("\u001f^7}P\u001e_4]M\tN*}K\u0005]\"LJ\u0018C(\u007fV\u0016J3dP\u0002")), method1881(method1880("\u0004_3}LV\u0004h")), method1881(method1880("\u0004_3}")), method1881(method1880("\u0018Y2h")), method1881(method1880("V\u0004h")), method1881(method1880("\u0006J1l\u0011\u0002N3#J\u001fN\u0014tL\u0018N*]M\u0003S.hL"))};
   @OriginalMember(
      owner = "client!gf",
      name = "i",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3274;
   @OriginalMember(
      owner = "client!gf",
      name = "k",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3275;

   @OriginalMember(
      owner = "client!gf",
      name = "httpProxyConnect",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;"
   )
   private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
      Socket var4 = new Socket(arg0, arg1);
      var4.setSoTimeout(10000);
      OutputStream var5 = var4.getOutputStream();
      if (arg2 == null) {
         var5.write((field3276[2] + this.field5144 + ":" + this.field5141 + field3276[6]).getBytes(Charset.forName(field3276[1])));
      } else {
         var5.write((field3276[2] + this.field5144 + ":" + this.field5141 + field3276[5] + arg2 + field3276[4]).getBytes(Charset.forName(field3276[1])));
      }

      var5.flush();
      BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
      String var7 = var6.readLine();
      if (var7 != null) {
         if (var7.startsWith(field3276[7]) || var7.startsWith(field3276[3])) {
            return var4;
         }

         if (var7.startsWith(field3276[8]) || var7.startsWith(field3276[0])) {
            int var8 = 0;
            String var9 = field3276[9];
            String var10 = var6.readLine();

            while(var10 != null && var8 < 50) {
               if (var10.toLowerCase().startsWith(var9)) {
                  String var11 = var10.substring(var9.length()).trim();
                  int var12 = var11.indexOf(32);
                  if (var12 != -1) {
                     var11 = var11.substring(0, var12);
                  }

                  throw new class298(var11);
               }

               var10 = var6.readLine();
               ++var8;
            }

            throw new class298("");
         }
      }

      var5.close();
      var6.close();
      var4.close();
      return null;
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public final Socket method1877(int arg0) throws IOException {
      boolean var2 = Boolean.parseBoolean(System.getProperty(field3276[23]));
      if (!var2) {
         System.setProperty(field3276[23], field3276[21]);
      }

      boolean var3 = ~this.field5141 == -444;

      List var4;
      List var5;
      try {
         var4 = this.field3273.select(new URI((!var3 ? field3276[20] : field3276[12]) + field3276[22] + this.field5144));
         var5 = this.field3273.select(new URI((var3 ? field3276[20] : field3276[12]) + field3276[22] + this.field5144));
      } catch (URISyntaxException var18) {
         return this.method2729((byte)52);
      }

      if (arg0 < 82) {
         this.field3273 = (ProxySelector)null;
      }

      var4.addAll(var5);
      Object[] var7 = var4.toArray();
      class298 var8 = null;
      Object[] var9 = var7;

      for(int var10 = 0; var9.length > var10; ++var10) {
         Object var11 = var9[var10];
         Proxy var12 = (Proxy)var11;

         try {
            Socket var13 = this.method1878((byte)112, var12);
            if (var13 != null) {
               return var13;
            }
         } catch (class298 var16) {
            var8 = var16;
         } catch (IOException var17) {
         }
      }

      if (var8 == null) {
         return this.method2729((byte)52);
      } else {
         throw var8;
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;"
   )
   private final Socket method1878(byte arg0, Proxy arg1) throws IOException {
      if (arg1.type() != Type.DIRECT) {
         SocketAddress var3 = arg1.address();
         if (!(var3 instanceof InetSocketAddress)) {
            return null;
         } else {
            InetSocketAddress var4 = (InetSocketAddress)var3;
            if (arg0 < 92) {
               return (Socket)null;
            } else if (arg1.type() == Type.HTTP) {
               String var5 = null;

               try {
                  Class var6 = Class.forName(field3276[11]);
                  Method var7 = var6.getDeclaredMethod(field3276[17], field3274 == null ? (field3274 = method1879(field3276[14])) : field3274, Integer.TYPE);
                  var7.setAccessible(true);
                  Object var8 = var7.invoke((Object)null, var4.getHostName(), new Integer(var4.getPort()));
                  if (var8 != null) {
                     Method var9 = var6.getDeclaredMethod(field3276[18]);
                     var9.setAccessible(true);
                     if ((Boolean)var9.invoke(var8)) {
                        Method var10 = var6.getDeclaredMethod(field3276[10]);
                        var10.setAccessible(true);
                        Method var11 = var6.getDeclaredMethod(field3276[16], field3275 == null ? (field3275 = method1879(field3276[15])) : field3275, field3274 == null ? (field3274 = method1879(field3276[14])) : field3274);
                        var11.setAccessible(true);
                        String var12 = (String)var10.invoke(var8);
                        String var13 = (String)var11.invoke(var8, new URL(field3276[19] + this.field5144 + "/"), field3276[12]);
                        var5 = var12 + field3276[13] + var13;
                     }
                  }
               } catch (Exception var16) {
               }

               return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var5);
            } else if (arg1.type() == Type.SOCKS) {
               Socket var15 = new Socket(arg1);
               var15.connect(new InetSocketAddress(this.field5144, this.field5141));
               return var15;
            } else {
               return null;
            }
         }
      } else {
         return this.method2729((byte)52);
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1879(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1880(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1881(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

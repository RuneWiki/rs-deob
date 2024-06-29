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

@OriginalClass("client!mga")
public class class737 extends class326 {
   @OriginalMember(
      owner = "client!mga",
      name = "k",
      descriptor = "Ljava/net/ProxySelector;"
   )
   private ProxySelector field10590 = ProxySelector.getDefault();
   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10593 = new String[]{method5307(method5306("7Fh3\nN<\rC\u0017O\"")), method5307(method5306("u\u0018")), method5307(method5306("7Fh3\nN<\fC\u0011O%")), method5307(method5306("_Zh7uP#\u0012S/")), method5307(method5306("7Fh3\nN<\fC\u0017O\"")), method5307(method5306("_Zh7uP#\u0012S/u")), method5307(method5306("6AsN\u001dG'\u0005N\u0014")), method5307(method5306("<]r-`<F\u001c")), method5307(method5306("7Fh3\nN<\rC\u0011O%")), method5307(method5306("\u000f`S\u001b\\RsI\u0017M\u001a|H\nF\u001efYY\u0005")), method5307(method5306("E=\u0013")), method5307(method5306("\u0017fH\u0013")), method5307(method5306("\u0015sJ\u0002\u000b\u0011wHMP\fwo\u001aV\u000bwQ3W\u0010jU\u0006V")), method5307(method5306("\u000b`I\u0006")), method5307(method5306("\u0017fH\u0013V")), method5307(method5306("\u0017fH\u0013VE=\u0013")), method5307(method5306("\u0018wH+@\u001evY\u0011s\u001e~I\u0006")), method5307(method5306("\fgL\u0013J\rfO3W\u001awQ\u0013Q\u0016dY\"P\u000bzS\u0011L\u0005sH\nJ\u0011")), method5307(method5306("\u0018wH3W\u0010jE\"P\u000bz")), method5307(method5306("\fgRMK\u001af\u0012\u0014R\b<L\u0011J\u000b}_\fIQzH\u0017UQSI\u0017M\u001a|H\nF\u001efU\fK6|Z\f")), method5307(method5306("\u0015sJ\u0002\u000b\u0011wHMp-^")), method5307(method5306("E2")), method5307(method5306("\u0018wH+@\u001evY\u0011k\u001e\u007fY")), method5307(method5306("\u0015sJ\u0002\u000b\u0013sR\u0004\u000b,fN\nK\u0018"))};
   @OriginalMember(
      owner = "client!mga",
      name = "i",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10591;
   @OriginalMember(
      owner = "client!mga",
      name = "j",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10592;

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Ljava/net/Proxy;B)Ljava/net/Socket;",
      line = 12
   )
   private final Socket method5304(Proxy arg0, byte arg1) throws IOException {
      if (arg1 < 1) {
         return (Socket)null;
      } else if (arg0.type() != Type.DIRECT) {
         SocketAddress var3 = arg0.address();
         if (!(var3 instanceof InetSocketAddress)) {
            return null;
         } else {
            InetSocketAddress var4 = (InetSocketAddress)var3;
            if (arg0.type() != Type.HTTP) {
               if (arg0.type() == Type.SOCKS) {
                  Socket var5 = new Socket(arg0);
                  var5.connect(new InetSocketAddress(this.field4682, this.field4676));
                  return var5;
               } else {
                  return null;
               }
            } else {
               String var6 = null;

               try {
                  Class var7 = Class.forName(field10593[19]);
                  Method var8 = var7.getDeclaredMethod(field10593[18], field10591 == null ? (field10591 = method5305(field10593[23])) : field10591, Integer.TYPE);
                  var8.setAccessible(true);
                  Object var9 = var8.invoke((Object)null, var4.getHostName(), new Integer(var4.getPort()));
                  if (var9 != null) {
                     Method var10 = var7.getDeclaredMethod(field10593[17]);
                     var10.setAccessible(true);
                     if ((Boolean)var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod(field10593[22]);
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod(field10593[16], field10592 == null ? (field10592 = method5305(field10593[20])) : field10592, field10591 == null ? (field10591 = method5305(field10593[23])) : field10591);
                        var12.setAccessible(true);
                        String var13 = (String)var11.invoke(var9);
                        String var14 = (String)var12.invoke(var9, new URL(field10593[15] + this.field4682 + "/"), field10593[14]);
                        var6 = var13 + field10593[21] + var14;
                     }
                  }
               } catch (Exception var16) {
               }

               return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
            }
         }
      } else {
         return this.method2526(0);
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 43
   )
   public static Class method5305(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "httpProxyConnect",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;",
      line = 91
   )
   private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
      Socket var4 = new Socket(arg0, arg1);
      var4.setSoTimeout(10000);
      OutputStream var5 = var4.getOutputStream();
      if (arg2 != null) {
         var5.write((field10593[7] + this.field4682 + ":" + this.field4676 + field10593[3] + arg2 + field10593[1]).getBytes(Charset.forName(field10593[6])));
      } else {
         var5.write((field10593[7] + this.field4682 + ":" + this.field4676 + field10593[5]).getBytes(Charset.forName(field10593[6])));
      }

      var5.flush();
      BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
      String var7 = var6.readLine();
      if (var7 != null) {
         if (var7.startsWith(field10593[4]) || var7.startsWith(field10593[0])) {
            return var4;
         }

         if (var7.startsWith(field10593[2]) || var7.startsWith(field10593[8])) {
            int var8 = 0;
            String var9 = var6.readLine();
            String var10 = field10593[9];

            while(var9 != null && var8 < 50) {
               if (var9.toLowerCase().startsWith(var10)) {
                  String var11 = var9.substring(var10.length()).trim();
                  int var12 = var11.indexOf(32);
                  if (var12 != -1) {
                     var11 = var11.substring(0, var12);
                  }

                  throw new class5(var11);
               }

               var9 = var6.readLine();
               ++var8;
            }

            throw new class5("");
         }
      }

      var5.close();
      var6.close();
      var4.close();
      return null;
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(B)Ljava/net/Socket;",
      line = 174
   )
   public final Socket method2527(byte arg0) throws IOException {
      boolean var2 = Boolean.parseBoolean(System.getProperty(field10593[12]));
      if (!var2) {
         System.setProperty(field10593[12], field10593[13]);
      }

      boolean var3 = this.field4676 == 443;

      List var4;
      List var5;
      try {
         var4 = this.field10590.select(new URI((var3 ? field10593[14] : field10593[11]) + field10593[10] + this.field4682));
         var5 = this.field10590.select(new URI((var3 ? field10593[11] : field10593[14]) + field10593[10] + this.field4682));
      } catch (URISyntaxException var18) {
         return this.method2526(0);
      }

      var4.addAll(var5);
      Object[] var7 = var4.toArray();
      class5 var8 = null;
      if (arg0 != 74) {
         return (Socket)null;
      } else {
         Object[] var9 = var7;

         for(int var10 = 0; ~var10 > ~var9.length; ++var10) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy)var11;

            try {
               Socket var13 = this.method5304(var12, (byte)43);
               if (var13 != null) {
                  return var13;
               }
            } catch (class5 var16) {
               var8 = var16;
            } catch (IOException var17) {
            }
         }

         if (var8 != null) {
            throw var8;
         } else {
            return this.method2526(arg0 + -74);
         }
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5306(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5307(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

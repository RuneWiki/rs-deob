import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class238 extends class96 {
   @OriginalMember(
      owner = "client!et",
      name = "u",
      descriptor = "Lco;"
   )
   public class364 field3675;
   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3679 = new String[]{method2099(method2098("kOE>\u0001")), method2099(method2098("u\u0015ERT")), method2099(method2098("kOE@@`R\u001fB\u0001")), method2099(method2098("`N\u0007\u0010")), method2099(method2098("kOE=\u0001")), method2099(method2098("kOE?\u0001"))};
   @OriginalMember(
      owner = "client!et",
      name = "x",
      descriptor = "[B"
   )
   public static byte[] field3672 = new byte[520];
   @OriginalMember(
      owner = "client!et",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field3673 = false;
   @OriginalMember(
      owner = "client!et",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3676;
   @OriginalMember(
      owner = "client!et",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3670;
   @OriginalMember(
      owner = "client!et",
      name = "y",
      descriptor = "Lhha;"
   )
   public static class724 field3678;
   @OriginalMember(
      owner = "client!et",
      name = "v",
      descriptor = "I"
   )
   public static int field3671;
   @OriginalMember(
      owner = "client!et",
      name = "w",
      descriptor = "I"
   )
   public static int field3674;
   @OriginalMember(
      owner = "client!et",
      name = "r",
      descriptor = "I"
   )
   public static int field3677;

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2095(int arg0) {
      try {
         if (arg0 <= 76) {
            method2096(62, true, (byte)35);
         }

         field3672 = null;
         field3676 = null;
         field3678 = null;
         field3670 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3679[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(IZB)V"
   )
   public static final void method2096(int param0, boolean param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!et",
      name = "<init>",
      descriptor = "(Lco;)V"
   )
   public class238(class364 arg0) {
      try {
         this.field3675 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3679[2] + (arg0 != null ? field3679[1] : field3679[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method2097(byte arg0) {
      try {
         ++field3671;
         class107 var1 = class545.field7775;
         synchronized(class545.field7775) {
            class545.field7775.method1045(3);
         }

         if (arg0 >= 5) {
            class107 var2 = class211.field3013;
            synchronized(class211.field3013) {
               class211.field3013.method1045(3);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3679[5] + arg0 + ')');
      }
   }

   static {
      String var0 = method2099(method2098("[U\u0000\u0012FyU"));

      try {
         var0 = System.getProperty(method2099(method2098("dZ\u001d\u001d\u0007x^\u0005\u0018F|"))).toLowerCase();
      } catch (Exception var11) {
      }

      var0.toLowerCase();
      String var1 = method2099(method2098("[U\u0000\u0012FyU"));

      try {
         var1 = System.getProperty(method2099(method2098("dZ\u001d\u001d\u0007x^\u0019\u000f@aU"))).toLowerCase();
      } catch (Exception var10) {
      }

      var1.toLowerCase();
      String var2 = method2099(method2098("[U\u0000\u0012FyU"));

      try {
         var2 = System.getProperty(method2099(method2098("aHE\u0012Hc^"))).toLowerCase();
      } catch (Exception var9) {
      }

      field3676 = var2.toLowerCase();
      String var3 = method2099(method2098("[U\u0000\u0012FyU"));

      try {
         var3 = System.getProperty(method2099(method2098("aHE\u001d[mS"))).toLowerCase();
      } catch (Exception var8) {
      }

      field3670 = var3.toLowerCase();
      String var4 = method2099(method2098("[U\u0000\u0012FyU"));

      try {
         var4 = System.getProperty(method2099(method2098("aHE\nL|H\u0002\u0013G"))).toLowerCase();
      } catch (Exception var7) {
      }

      var4.toLowerCase();
      String var5 = method2099(method2098("p\u0014"));

      try {
         var5 = System.getProperty(method2099(method2098("{H\u000e\u000e\u0007fT\u0006\u0019"))).toLowerCase();
      } catch (Exception var6) {
      }

      new File(var5);
      field3678 = new class724(64, -1);
   }

   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2098(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2099(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

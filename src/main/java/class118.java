import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class118 {
   @OriginalMember(
      owner = "client!qk",
      name = "b",
      descriptor = "Lwr;"
   )
   public class383 field1852;
   @OriginalMember(
      owner = "client!qk",
      name = "e",
      descriptor = "Lwr;"
   )
   public class383 field1853;
   @OriginalMember(
      owner = "client!qk",
      name = "c",
      descriptor = "[Lmn;"
   )
   public class8[] field1854;
   @OriginalMember(
      owner = "client!qk",
      name = "d",
      descriptor = "Lwr;"
   )
   public class383 field1856;
   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "[Lmn;"
   )
   public class8[] field1857;
   @OriginalMember(
      owner = "client!qk",
      name = "g",
      descriptor = "Z"
   )
   public boolean field1858;
   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1859 = new String[]{method1147(method1146("\u0007|wv")), method1147(method1146("\u0012'54\u001f")), method1147(method1146("\u0018b5&\u000b\u0007`o$J")), method1147(method1146("\u0018b5[J"))};
   @OriginalMember(
      owner = "client!qk",
      name = "h",
      descriptor = "I"
   )
   public static int field1855;
   @OriginalMember(
      owner = "client!qk",
      name = "f",
      descriptor = "J"
   )
   public static long field1851;

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1145(int arg0, int arg1, int arg2) {
      try {
         ++field1855;
         int var3 = 64 % ((-76 - arg1) / 47);
         return ~(16 & arg2) != -1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1859[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class118(class678 arg0) {
      boolean var2 = client.field10022;
      super();
      this.field1852 = null;
      this.field1853 = null;
      this.field1854 = null;
      this.field1856 = null;
      this.field1857 = null;

      try {
         this.field1858 = arg0.field9731;
         class572.method4236(9731, arg0);
         if (this.field1858) {
            byte[] var3 = class614.method4514(class266.field4060, false, false);
            this.field1856 = new class383(arg0, 6410, 128, 128, 16, var3, 6410);
            byte[] var4 = class614.method4514(class224.field3177, false, false);
            this.field1852 = new class383(arg0, 6410, 128, 128, 16, var4, 6410);
            class561 var5 = arg0.field9684;
            if (var5.method4178(false)) {
               class383 var7;
               label35: {
                  byte[] var6 = class614.method4514(class17.field238, false, false);
                  this.field1853 = new class383(arg0, 6408, 128, 128, 16);
                  var7 = new class383(arg0, 6409, 128, 128, 16, var6, 6409);
                  if (var5.method4176(2.0F, this.field1853, 1, var7)) {
                     this.field1853.method5211(true);
                     if (!var2) {
                        break label35;
                     }
                  }

                  this.field1853.method5203((byte)-38);
                  this.field1853 = null;
               }

               var7.method5203((byte)-38);
               return;
            }
         } else {
            Object var10000;
            short var10001;
            label63: {
               this.field1854 = new class8[16];
               int var8 = 0;
               if (var2) {
                  var10000 = class266.field4060;
                  var10001 = -23419;
               } else if (~var8 <= -17) {
                  var10000 = this;
                  var10001 = 16;
                  if (!var2) {
                     break label63;
                  }
               } else {
                  var10000 = class266.field4060;
                  var10001 = -23419;
               }

               while(true) {
                  byte[] var9 = class521.method3888(var10000, var10001, 32768, var8 * 32768);
                  this.field1854[var8] = new class8(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
                  ++var8;
                  if (~var8 <= -17) {
                     var10000 = this;
                     var10001 = 16;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = class266.field4060;
                     var10001 = -23419;
                  }
               }
            }

            ((class118)var10000).field1857 = new class8[var10001];
            int var10 = 0;
            if (var2 || var10 < 16) {
               do {
                  byte[] var11 = class521.method3888(class224.field3177, -23419, 32768, var10 * 256 * 128);
                  this.field1857[var10] = new class8(arg0, 3553, 6410, 128, 128, true, var11, 6410, false);
                  ++var10;
               } while(var10 < 16);
            }
         }

      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1859[2] + (arg0 != null ? field1859[1] : field1859[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1146(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1147(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

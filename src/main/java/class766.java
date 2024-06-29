import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class766 {
   @OriginalMember(
      owner = "client!eja",
      name = "l",
      descriptor = "I"
   )
   public int field11293 = 0;
   @OriginalMember(
      owner = "client!eja",
      name = "c",
      descriptor = "I"
   )
   public int field11298 = 0;
   @OriginalMember(
      owner = "client!eja",
      name = "k",
      descriptor = "Loi;"
   )
   private class80 field11299 = new class80(64);
   @OriginalMember(
      owner = "client!eja",
      name = "j",
      descriptor = "Lmd;"
   )
   private class570 field11303 = null;
   @OriginalMember(
      owner = "client!eja",
      name = "f",
      descriptor = "Lkf;"
   )
   private class266 field11301;
   @OriginalMember(
      owner = "client!eja",
      name = "d",
      descriptor = "Lkf;"
   )
   private class266 field11292;
   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11304 = new String[]{method5550(method5549("g;0\u001b\u001b*")), method5550(method5549("l$=Y")), method5550(method5549("y\u007f\u007f\u001b'")), method5550(method5549("g;0\u001b\u0019*")), method5550(method5549("g;0\u001b\u0018*")), method5550(method5549("g;0\u001b\u001e*")), method5550(method5549("g;0\u001bfk?8Ad*"))};
   @OriginalMember(
      owner = "client!eja",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field11296 = false;
   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "I"
   )
   public static int field11294;
   @OriginalMember(
      owner = "client!eja",
      name = "h",
      descriptor = "I"
   )
   public static int field11295;
   @OriginalMember(
      owner = "client!eja",
      name = "b",
      descriptor = "I"
   )
   public static int field11297;
   @OriginalMember(
      owner = "client!eja",
      name = "e",
      descriptor = "I"
   )
   public static int field11300;
   @OriginalMember(
      owner = "client!eja",
      name = "i",
      descriptor = "I"
   )
   public static int field11302;

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "([ILwu;JI)Ljava/lang/String;"
   )
   public final String method5545(int[] arg0, class395 arg1, long arg2, int arg3) {
      try {
         ++field11297;
         if (this.field11303 != null) {
            String var6 = this.field11303.method3393(arg2, arg1, -8284, arg0);
            if (var6 != null) {
               return var6;
            }
         }

         if (arg3 >= -41) {
            this.method5545((int[])null, (class395)null, -33L, -71);
         }

         return Long.toString(arg2);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11304[3] + (arg0 != null ? field11304[2] : field11304[1]) + ',' + (arg1 != null ? field11304[2] : field11304[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method5546(boolean arg0, int arg1) {
      try {
         ++field11294;
         if (!arg0) {
            method5547(95);
         }

         class80 var2 = class220.field3139;
         synchronized(class220.field3139) {
            class220.field3139.method726(arg1, 25324);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11304[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5547(int arg0) {
      try {
         class80 var1 = class220.field3139;
         synchronized(class220.field3139) {
            class220.field3139.method731(arg0 ^ arg0);
         }

         ++field11300;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11304[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(II)Lfja;"
   )
   public final class785 method5548(int arg0, int arg1) {
      try {
         ++field11295;
         class785 var3 = (class785)this.field11299.method725(arg0 ^ arg0, (long)arg1);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label25: {
               if (arg1 < 32768) {
                  var4 = this.field11292.method2037(false, arg1, 1);
                  if (!client.field4360) {
                     break label25;
                  }
               }

               var4 = this.field11301.method2037(false, arg1 & 32767, 1);
            }

            class785 var5 = new class785();
            var5.field11511 = this;
            if (var4 != null) {
               var5.method5654(new class147(var4), 0);
            }

            if (~arg1 <= -32769) {
               var5.method5657(false);
            }

            this.field11299.method723(arg0, (long)arg1, var5);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11304[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "<init>",
      descriptor = "(ILkf;Lkf;Lmd;)V"
   )
   public class766(int arg0, class266 arg1, class266 arg2, class570 arg3) {
      try {
         this.field11301 = arg2;
         this.field11292 = arg1;
         this.field11303 = arg3;
         if (this.field11292 != null) {
            this.field11293 = this.field11292.method2060(2, 1);
         }

         if (this.field11301 != null) {
            this.field11298 = this.field11301.method2060(2, 1);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11304[6] + arg0 + ',' + (arg1 != null ? field11304[2] : field11304[1]) + ',' + (arg2 != null ? field11304[2] : field11304[1]) + ',' + (arg3 != null ? field11304[2] : field11304[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5549(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5550(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class348 {
   @OriginalMember(
      owner = "client!hp",
      name = "b",
      descriptor = "Lll;"
   )
   private class387 field4698;
   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4706 = new String[]{method2548(method2547("HeCYl")), method2548(method2547("\u0000R O")), method2548(method2547("\f5")), method2548(method2547("HeCZl")), method2548(method2547("N`\u0001w")), method2548(method2547("[;C59")), method2548(method2547("HeCXl")), method2548(method2547("HeC_l")), method2548(method2547("HeC^l")), method2548(method2547("HeC]l")), method2548(method2547("HeC'-N|\u0019%l"))};
   @OriginalMember(
      owner = "client!hp",
      name = "g",
      descriptor = "I"
   )
   public static int field4702 = 100;
   @OriginalMember(
      owner = "client!hp",
      name = "f",
      descriptor = "I"
   )
   public static int field4697;
   @OriginalMember(
      owner = "client!hp",
      name = "e",
      descriptor = "I"
   )
   public static int field4699;
   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "I"
   )
   public static int field4701;
   @OriginalMember(
      owner = "client!hp",
      name = "i",
      descriptor = "I"
   )
   public static int field4703;
   @OriginalMember(
      owner = "client!hp",
      name = "d",
      descriptor = "I"
   )
   public static int field4704;
   @OriginalMember(
      owner = "client!hp",
      name = "h",
      descriptor = "I"
   )
   public static int field4705;
   @OriginalMember(
      owner = "client!hp",
      name = "c",
      descriptor = "Loh;"
   )
   private class428 field4700;

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(I)Loh;",
      line = 4
   )
   public final class428 method2541(int arg0) {
      try {
         if (arg0 != 10) {
            this.field4698 = null;
         }

         ++field4701;
         class428 var2 = this.field4698.field5611.field6126;
         if (this.field4698.field5611 == var2) {
            this.field4700 = null;
            return null;
         } else {
            this.field4700 = var2.field6126;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4706[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(B)Loh;",
      line = 24
   )
   public final class428 method2542(byte arg0) {
      try {
         if (arg0 > -82) {
            return null;
         } else {
            ++field4703;
            class428 var2 = this.field4700;
            if (this.field4698.field5611 == var2) {
               this.field4700 = null;
               return null;
            } else {
               this.field4700 = var2.field6126;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4706[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(JI)Ljava/lang/String;",
      line = 47
   )
   public static final String method2543(long arg0, int arg1) {
      try {
         ++field4697;
         class757.field11217.setTime(new Date(arg0));
         int var3 = class757.field11217.get(7);
         int var4 = class757.field11217.get(5);
         int var5 = class757.field11217.get(2);
         int var6 = class757.field11217.get(1);
         if (arg1 != -8981) {
            method2543(-124L, -14);
         }

         int var7 = class757.field11217.get(11);
         int var8 = class757.field11217.get(12);
         int var9 = class757.field11217.get(13);
         return class412.field5951[var3 - 1] + field4706[2] + var4 / 10 + var4 % 10 + "-" + class733.field10724[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + field4706[1];
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field4706[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(II)Z",
      line = 74
   )
   public static final boolean method2544(int arg0, int arg1) {
      try {
         int var2 = 65 / ((-22 - arg1) / 59);
         ++field4704;
         return arg0 == 0 || arg0 == 2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4706[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(IZI)Z",
      line = 86
   )
   public static final boolean method2545(int arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            return false;
         } else {
            ++field4705;
            return ~(2048 & arg2) != -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4706[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(Lll;I)V",
      line = 97
   )
   public final void method2546(class387 arg0, int arg1) {
      try {
         this.field4698 = arg0;
         if (arg1 > -73) {
            method2543(-97L, 102);
         }

         ++field4699;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4706[6] + (arg0 != null ? field4706[5] : field4706[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "<init>",
      descriptor = "()V",
      line = 116
   )
   public class348() {
   }

   @OriginalMember(
      owner = "client!hp",
      name = "<init>",
      descriptor = "(Lll;)V",
      line = 120
   )
   public class348(class387 arg0) {
      try {
         this.field4698 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4706[10] + (arg0 != null ? field4706[5] : field4706[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2547(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2548(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

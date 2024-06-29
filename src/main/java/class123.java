import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class123 {
   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "I"
   )
   private int field1496 = 0;
   @OriginalMember(
      owner = "client!bba",
      name = "e",
      descriptor = "Lwia;"
   )
   private class791 field1492;
   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1502 = new String[]{method1018(method1017("\u0013\u001fT2.Y")), method1018(method1017("\u0013\u001fT2-Y")), method1018(method1017("\u0013\u001fT2+Y")), method1018(method1017("\u0013\u001fT2S\u0018\u0013\\hQY")), method1018(method1017("\nS\u001b2\u0012")), method1018(method1017("\u001f\bYp")), method1018(method1017("\u0013\u001fT2,Y"))};
   @OriginalMember(
      owner = "client!bba",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field1498 = new int[13];
   @OriginalMember(
      owner = "client!bba",
      name = "c",
      descriptor = "I"
   )
   public static int field1494 = 0;
   @OriginalMember(
      owner = "client!bba",
      name = "g",
      descriptor = "I"
   )
   public static int field1495 = 0;
   @OriginalMember(
      owner = "client!bba",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field1501 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!bba",
      name = "f",
      descriptor = "I"
   )
   public static int field1497;
   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "I"
   )
   public static int field1499;
   @OriginalMember(
      owner = "client!bba",
      name = "h",
      descriptor = "I"
   )
   public static int field1500;
   @OriginalMember(
      owner = "client!bba",
      name = "i",
      descriptor = "Lwb;"
   )
   private class347 field1493;

   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "(I)Lwb;"
   )
   public final class347 method1013(int arg0) {
      int var2 = client.field4530;

      try {
         ++field1499;
         if (arg0 > ~this.field1496 && this.field1492.field11488[this.field1496 - 1] != this.field1493) {
            class347 var3 = this.field1493;
            this.field1493 = var3.field5278;
            return var3;
         } else {
            while(~this.field1492.field11501 < ~this.field1496) {
               class347 var4 = this.field1492.field11488[this.field1496++].field5278;
               class347 var10000 = this.field1492.field11488[this.field1496 - 1];

               while(var10000 != var4) {
                  this.field1493 = var4.field5278;
                  var10000 = var4;
                  if (var2 == 0) {
                     return var4;
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1502[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1014(byte arg0) {
      try {
         if (arg0 <= 45) {
            method1014((byte)118);
         }

         ++field1500;
         if (!class307.field4371) {
            class307.field4371 = true;
            class280.field3895 += (-class280.field3895 + 24.0F) / 2.0F;
            class630.field9159 = true;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1502[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Z)Lwb;"
   )
   public final class347 method1015(boolean arg0) {
      try {
         this.field1496 = 0;
         if (!arg0) {
            this.method1015(true);
         }

         ++field1497;
         return this.method1013(-1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1502[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1016(int arg0) {
      try {
         field1498 = null;
         field1501 = null;
         if (arg0 >= -102) {
            method1016(111);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1502[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "<init>",
      descriptor = "()V"
   )
   public class123() {
   }

   @OriginalMember(
      owner = "client!bba",
      name = "<init>",
      descriptor = "(Lwia;)V"
   )
   public class123(class791 arg0) {
      try {
         this.field1492 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1502[3] + (arg0 != null ? field1502[4] : field1502[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1017(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1018(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

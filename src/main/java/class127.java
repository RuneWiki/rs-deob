import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class127 {
   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "I"
   )
   public int field1628;
   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1630 = new String[]{method1016(method1015(":SOS\"c")), method1016(method1015(":SOS\\\"^G\t^c")), method1016(method1015("%EB\u0011")), method1016(method1015(":SOS#c")), method1016(method1015("0\u001e\u0000S\u001d")), method1016(method1015(":SOS!c")), method1016(method1015(":SOS\u0014$cZ\u000f\t%W\u0006"))};
   @OriginalMember(
      owner = "client!qca",
      name = "d",
      descriptor = "I"
   )
   public static int field1626 = -2;
   @OriginalMember(
      owner = "client!qca",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field1627 = new class118(103, 0);
   @OriginalMember(
      owner = "client!qca",
      name = "e",
      descriptor = "I"
   )
   public static int field1624;
   @OriginalMember(
      owner = "client!qca",
      name = "c",
      descriptor = "I"
   )
   public static int field1625;
   @OriginalMember(
      owner = "client!qca",
      name = "f",
      descriptor = "I"
   )
   public static int field1629;

   @OriginalMember(
      owner = "client!qca",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field1629;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1630[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1012(int arg0) {
      try {
         if (arg0 != 0) {
            field1627 = null;
         }

         field1627 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1630[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(ILbl;)V"
   )
   public static final void method1013(int arg0, class678 arg1) {
      try {
         if (arg0 == 0) {
            ++field1624;
            if (class614.field9019 == arg1.field9865) {
               if (class564.field8045.field1575 == null) {
                  arg1.field9885 = 0;
                  arg1.field9994 = 0;
               } else {
                  arg1.field9943 = 150;
                  arg1.field9990 = (int)(Math.sin((double)class96.field1234 / 40.0D) * 256.0D) & 2047;
                  arg1.field9874 = 5;
                  arg1.field9994 = class358.field4891;
                  arg1.field9885 = class22.method134(-13, class564.field8045.field1575);
                  arg1.field9862 = 0;
                  arg1.field9886 = class564.field8045.field3859;
                  arg1.field9869 = class564.field8045.field3805;
                  arg1.field9855 = class564.field8045.field3879;
                  class85 var2 = arg1.field9855 != -1 ? class190.field2702.method4411(arg1.field9855, 92) : null;
                  if (var2 != null) {
                     class550.method3944(arg1.field9886, 1, var2);
                  }

               }
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1630[5] + arg0 + ',' + (arg1 != null ? field1630[4] : field1630[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class127(int arg0, int arg1) {
      try {
         this.field1628 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1630[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z"
   )
   public static final boolean method1014(String arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field1625;
         if (arg0 == null) {
            return false;
         } else {
            int var3 = arg1;
            if (var2) {
               if (arg0.equalsIgnoreCase(class581.field8554[arg1])) {
                  return true;
               }

               var3 = arg1 + 1;
            }

            while(true) {
               while(var3 < class710.field10360) {
                  if (arg0.equalsIgnoreCase(class581.field8554[var3])) {
                     return true;
                  }

                  ++var3;
               }

               boolean var10000 = arg0.equalsIgnoreCase(class564.field8045.field1575);
               if (!var2) {
                  if (var10000) {
                     return true;
                  }

                  return false;
               }

               if (var10000) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1630[3] + (arg0 != null ? field1630[4] : field1630[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1015(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1016(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

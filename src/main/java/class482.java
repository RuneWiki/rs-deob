import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class482 {
   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7012 = new String[]{method3647(method3646("]\u0002\u001a>")), method3647(method3646("HYX|\u001e")), method3647(method3646("@\u001dX\u0013K")), method3647(method3646("@\u001dX\u0010K")), method3647(method3646("@\u001dX\u0011K")), method3647(method3646("@\u001dX\u0016K"))};
   @OriginalMember(
      owner = "client!sj",
      name = "h",
      descriptor = "Luw;"
   )
   public static class435 field7005 = new class435(84, 5);
   @OriginalMember(
      owner = "client!sj",
      name = "d",
      descriptor = "Lgh;"
   )
   public static class572 field7008 = new class572(115, 6);
   @OriginalMember(
      owner = "client!sj",
      name = "c",
      descriptor = "I"
   )
   public static int field7004;
   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "I"
   )
   public static int field7006;
   @OriginalMember(
      owner = "client!sj",
      name = "f",
      descriptor = "I"
   )
   public static int field7009;
   @OriginalMember(
      owner = "client!sj",
      name = "e",
      descriptor = "Lth;"
   )
   public static class620 field7011;
   @OriginalMember(
      owner = "client!sj",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7010;
   @OriginalMember(
      owner = "client!sj",
      name = "g",
      descriptor = "[Z"
   )
   public static boolean[] field7007;

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(ILjava/lang/String;)V",
      line = 7
   )
   public static final void method3642(int arg0, String arg1) {
      try {
         System.exit(1);
         if (arg0 != 6) {
            field7007 = null;
         }

         ++field7006;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7012[3] + arg0 + ',' + (arg1 != null ? field7012[1] : field7012[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(II)[B",
      line = 22
   )
   public static final synchronized byte[] method3643(int arg0, int arg1) {
      try {
         ++field7009;
         if (arg1 == 100 && ~class478.field6963 < -1) {
            byte[] var2 = class570.field8251[--class478.field6963];
            class570.field8251[class478.field6963] = null;
            return var2;
         } else {
            if (arg0 != 0) {
               method3644((byte)-128);
            }

            if (~arg1 == -5001 && class326.field4675 > 0) {
               byte[] var3 = class261.field3679[--class326.field4675];
               class261.field3679[class326.field4675] = null;
               return var3;
            } else if (~arg1 == -30001 && class196.field2962 > 0) {
               byte[] var4 = class66.field1225[--class196.field2962];
               class66.field1225[class196.field2962] = null;
               return var4;
            } else {
               if (class554.field8026 != null) {
                  for(int var5 = 0; ~var5 > ~class267.field3796.length; ++var5) {
                     if (class267.field3796[var5] == arg1 && class265.field3777[var5] > 0) {
                        byte[] var6 = class554.field8026[var5][--class265.field3777[var5]];
                        class554.field8026[var5][class265.field3777[var5]] = null;
                        return var6;
                     }
                  }
               }

               return new byte[arg1];
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7012[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(B)V",
      line = 80
   )
   public static void method3644(byte arg0) {
      try {
         if (arg0 > -29) {
            field7007 = null;
         }

         field7010 = null;
         field7008 = null;
         field7011 = null;
         field7007 = null;
         field7005 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7012[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(I[B)V",
      line = 99
   )
   public static final synchronized void method3645(int arg0, byte[] arg1) {
      boolean var2 = client.field4564;

      try {
         ++field7004;
         if (arg1.length == 100 && ~class478.field6963 > -1001) {
            class570.field8251[class478.field6963++] = arg1;
         } else if (~arg1.length == -5001 && class326.field4675 < 250) {
            class261.field3679[class326.field4675++] = arg1;
         } else if (~arg1.length == -30001 && class196.field2962 < 50) {
            class66.field1225[class196.field2962++] = arg1;
         } else {
            if (class554.field8026 != null) {
               int var3 = 0;
               if (var2 || var3 < class267.field3796.length) {
                  do {
                     if (class267.field3796[var3] == arg1.length && class554.field8026[var3].length > class265.field3777[var3]) {
                        class554.field8026[var3][class265.field3777[var3]++] = arg1;
                        return;
                     }

                     ++var3;
                  } while(var3 < class267.field3796.length);
               }
            }

            if (arg0 < 67) {
               method3644((byte)23);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7012[2] + arg0 + ',' + (arg1 != null ? field7012[1] : field7012[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3646(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3647(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

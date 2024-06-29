import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class678 {
   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9951 = new String[]{method4955(method4954("@=JK")), method4955(method4954("H#\bc-")), method4955(method4954("Uf\b\tx")), method4955(method4954("H#\be-")), method4955(method4954("H#\bSj}<TNkI`")), method4955(method4954("H#\bf-")), method4955(method4954("H#\bd-"))};
   @OriginalMember(
      owner = "client!fk",
      name = "d",
      descriptor = "Lgh;"
   )
   public static class572 field9948 = new class572(19, -2);
   @OriginalMember(
      owner = "client!fk",
      name = "f",
      descriptor = "I"
   )
   public static int field9944;
   @OriginalMember(
      owner = "client!fk",
      name = "b",
      descriptor = "I"
   )
   public static int field9945;
   @OriginalMember(
      owner = "client!fk",
      name = "g",
      descriptor = "I"
   )
   public static int field9946;
   @OriginalMember(
      owner = "client!fk",
      name = "e",
      descriptor = "I"
   )
   public static int field9947;
   @OriginalMember(
      owner = "client!fk",
      name = "c",
      descriptor = "I"
   )
   public static int field9950;
   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "Lda;"
   )
   public static class66 field9949;

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method4950(int arg0, int arg1) {
      try {
         if (arg0 >= -113) {
            method4951(108, (byte)-87, 57, 72, -73, (byte[])null);
         }

         ++field9946;
         return arg1 == 3 || arg1 == 7 || ~arg1 == -11;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9951[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(IBIII[B)V"
   )
   public static final void method4951(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      boolean var6 = client.field4564;

      try {
         ++field9950;
         if (arg0 < arg2) {
            arg3 += arg0;
            int var15 = -arg0 + arg2 >> 2;
            int var9;
            if (var6) {
               var9 = arg3 + 1;
               arg5[arg3] = 1;
               int var10 = var9 + 1;
               arg5[var9] = 1;
               int var11 = var10 + 1;
               arg5[var10] = 1;
               arg3 = var11 + 1;
               arg5[var11] = 1;
            }

            while(true) {
               while(true) {
                  --var15;
                  if (var15 < 0) {
                     if (!var6) {
                        if (arg1 < 89) {
                           method4950(98, 85);
                        }

                        var15 = 3 & -arg0 + arg2;
                        if (!var6) {
                           --var15;
                           if (var15 < 0) {
                              return;
                           }
                        }

                        do {
                           arg5[arg3++] = 1;
                           --var15;
                        } while(var15 >= 0);

                        return;
                     }

                     arg5[arg3++] = 1;
                  } else {
                     var9 = arg3 + 1;
                     arg5[arg3] = 1;
                     arg5[var9++] = 1;
                     arg5[var9++] = 1;
                     arg3 = var9 + 1;
                     arg5[var9] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9951[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9951[2] : field9951[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(IIZ)I"
   )
   public final int method4952(int arg0, int arg1, boolean arg2) {
      try {
         ++field9945;
         int var4 = ~arg1 <= ~class720.field10406 ? arg1 : class720.field10406;
         if (class503.field7334 == this) {
            return 0;
         } else {
            if (!arg2) {
               method4953((byte)49);
            }

            if (class656.field9579 == this) {
               return -arg0 + var4;
            } else {
               return class594.field8571 == this ? (var4 - arg0) / 2 : 0;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9951[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4953(byte arg0) {
      try {
         if (arg0 != 1) {
            field9948 = null;
         }

         field9949 = null;
         field9948 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9951[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9944;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9951[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4954(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4955(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

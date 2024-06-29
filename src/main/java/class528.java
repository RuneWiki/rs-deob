import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class528 {
   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7697 = new String[]{method3959(method3958("i//j\u0000")), method3959(method3958("i//l\u0000")), method3959(method3958("i//m\u0000")), method3959(method3958("i//k\u0000")), method3959(method3958("i//o\u0000"))};
   @OriginalMember(
      owner = "client!ko",
      name = "e",
      descriptor = "Lgh;"
   )
   public static class572 field7690 = new class572(70, 0);
   @OriginalMember(
      owner = "client!ko",
      name = "f",
      descriptor = "I"
   )
   public static int field7696 = -1;
   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field7694 = false;
   @OriginalMember(
      owner = "client!ko",
      name = "h",
      descriptor = "I"
   )
   public static int field7689;
   @OriginalMember(
      owner = "client!ko",
      name = "d",
      descriptor = "I"
   )
   public static int field7691;
   @OriginalMember(
      owner = "client!ko",
      name = "b",
      descriptor = "I"
   )
   public static int field7692;
   @OriginalMember(
      owner = "client!ko",
      name = "c",
      descriptor = "I"
   )
   public static int field7695;
   @OriginalMember(
      owner = "client!ko",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field7693;

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3953(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 > -18) {
            field7690 = null;
         }

         ++field7691;
         boolean var3 = ~(arg0 & 55) == -1 ? class383.method2980(arg1, 0, arg0) : class139.method1298((byte)-123, arg1, arg0);
         return ~(arg1 & 65536) != -1 | class4.method28(arg1, (byte)-43, arg0) | var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7697[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3954(int arg0) {
      try {
         if (arg0 != 0) {
            field7694 = false;
         }

         field7690 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7697[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3955(int arg0) {
      try {
         if (class445.field6487 != null) {
            class445.field6487.method1071(-67);
         }

         ++field7692;
         if (arg0 > -38) {
            field7693 = false;
         }

         if (class673.field9873 != null) {
            while(true) {
               try {
                  class673.field9873.join();
                  return;
               } catch (InterruptedException var2) {
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7697[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3956(int arg0, int arg1, int arg2) {
      try {
         ++field7689;
         if (arg1 != -26287) {
            method3957(-110, 28, 112);
         }

         return (arg2 & 65536) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7697[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method3957(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         if (class203.field3034 != arg2) {
            label44: {
               if (arg0 < 0) {
                  int var4 = 0;
                  if (var3) {
                     client.field4561[var4] = arg1;
                     ++var4;
                  }

                  while(true) {
                     while(var4 < 16) {
                        client.field4561[var4] = arg1;
                        ++var4;
                     }

                     if (!var3) {
                        if (!var3) {
                           break label44;
                        }
                        break;
                     }

                     ++var4;
                  }
               }

               client.field4561[arg0] = arg1;
            }
         }

         ++field7695;
         class657.field9595.method4292(arg0, (byte)116, arg1);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7697[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3958(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3959(char[] arg0) {
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
            var10005 = 64;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

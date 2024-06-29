import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class505 extends class230 {
   @OriginalMember(
      owner = "client!kia",
      name = "s",
      descriptor = "I"
   )
   private int field7740 = 0;
   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7745 = new String[]{method3927(method3926("tDV\u0005[7")), method3927(method3926("tDV\u0005P7")), method3927(method3926("qX[G")), method3927(method3926("d\u0003\u0019\u0005e")), method3927(method3926("tDV\u0005Q7")), method3927(method3926("tDV\u0005R7"))};
   @OriginalMember(
      owner = "client!kia",
      name = "p",
      descriptor = "[F"
   )
   public static float[] field7742 = new float[4];
   @OriginalMember(
      owner = "client!kia",
      name = "n",
      descriptor = "I"
   )
   public static int field7738;
   @OriginalMember(
      owner = "client!kia",
      name = "o",
      descriptor = "I"
   )
   public static int field7739;
   @OriginalMember(
      owner = "client!kia",
      name = "r",
      descriptor = "I"
   )
   public static int field7741;
   @OriginalMember(
      owner = "client!kia",
      name = "m",
      descriptor = "Lro;"
   )
   public static class148 field7744;
   @OriginalMember(
      owner = "client!kia",
      name = "q",
      descriptor = "[[Lfq;"
   )
   public static class374[][] field7743;

   @OriginalMember(
      owner = "client!kia",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3923(int arg0) {
      try {
         field7742 = null;
         if (arg0 != 126) {
            method3923(-29);
         }

         field7744 = null;
         field7743 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7745[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method284(boolean arg0, boolean arg1) {
      try {
         ++field7738;
         int var3 = super.field3521.field6345.method5105(116, class154.field2293, super.field3526.method2106()) + super.field3521.field6342;
         int var4 = super.field3521.field6334.method5508(68, class445.field6835, super.field3526.method2108()) + super.field3521.field6337;
         super.field3526.method4951((float)(super.field3526.method2106() / 2 + var3), (float)(var4 - -(super.field3526.method2108() / 2)), 4096, this.field7740);
         if (arg0) {
            method3924(-120, (String)null);
         }

         this.field7740 += ((class342)super.field3521).field5200;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7745[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(ILjava/lang/String;)Z"
   )
   public static final boolean method3924(int arg0, String arg1) {
      try {
         ++field7741;
         if (arg0 != 126) {
            field7743 = null;
         }

         return class640.field9277.containsKey(arg1);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7745[4] + arg0 + ',' + (arg1 != null ? field7745[3] : field7745[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method3925(int arg0, int arg1, int arg2) {
      try {
         ++field7739;
         if (arg0 != -26196) {
            field7743 = null;
         }

         if (arg1 == -1) {
            return 12345678;
         } else {
            arg2 = (127 & arg1) * arg2 >> 7;
            if (arg2 >= 2) {
               if (arg2 <= 126) {
                  return (65408 & arg1) - -arg2;
               }

               arg2 = 126;
               if (!client.field1786) {
                  return (65408 & arg1) - -arg2;
               }
            }

            arg2 = 2;
            return (65408 & arg1) - -arg2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7745[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "<init>",
      descriptor = "(Lrr;Lww;)V"
   )
   public class505(class678 arg0, class342 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3926(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3927(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

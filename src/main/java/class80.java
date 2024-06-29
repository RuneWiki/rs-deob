import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class80 extends class770 {
   @OriginalMember(
      owner = "client!u",
      name = "n",
      descriptor = "Z"
   )
   public boolean field1008 = false;
   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1009 = new String[]{method785(method784("\u0003I\u0016c9")), method785(method784("\u0003I\u0018c9")), method785(method784("\rIp\fl")), method785(method784("\u0018\u00122N")), method785(method784("\u0003I\u001ac9")), method785(method784("\u0003I\u0019c9")), method785(method784("\u0003I\u0017c9"))};
   @OriginalMember(
      owner = "client!u",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field1007 = new int[500];
   @OriginalMember(
      owner = "client!u",
      name = "p",
      descriptor = "B"
   )
   public byte field1001;
   @OriginalMember(
      owner = "client!u",
      name = "j",
      descriptor = "B"
   )
   public byte field1005;
   @OriginalMember(
      owner = "client!u",
      name = "o",
      descriptor = "I"
   )
   public static int field1000;
   @OriginalMember(
      owner = "client!u",
      name = "g",
      descriptor = "I"
   )
   public static int field1002;
   @OriginalMember(
      owner = "client!u",
      name = "i",
      descriptor = "I"
   )
   public int field1003;
   @OriginalMember(
      owner = "client!u",
      name = "s",
      descriptor = "I"
   )
   public int field1006;
   @OriginalMember(
      owner = "client!u",
      name = "m",
      descriptor = "I"
   )
   public int field993;
   @OriginalMember(
      owner = "client!u",
      name = "f",
      descriptor = "I"
   )
   public int field994;
   @OriginalMember(
      owner = "client!u",
      name = "k",
      descriptor = "I"
   )
   public static int field995;
   @OriginalMember(
      owner = "client!u",
      name = "h",
      descriptor = "I"
   )
   public static int field996;
   @OriginalMember(
      owner = "client!u",
      name = "u",
      descriptor = "I"
   )
   public int field998;
   @OriginalMember(
      owner = "client!u",
      name = "l",
      descriptor = "I"
   )
   public int field999;
   @OriginalMember(
      owner = "client!u",
      name = "r",
      descriptor = "Lu;"
   )
   public class80 field1004;
   @OriginalMember(
      owner = "client!u",
      name = "q",
      descriptor = "Z"
   )
   public boolean field997;

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "([Loda;I)I"
   )
   public abstract int method401(class127[] arg0, int arg1);

   @OriginalMember(
      owner = "client!u",
      name = "h",
      descriptor = "(I)V"
   )
   public abstract void method768(int arg0);

   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "(ZLha;)Z"
   )
   public abstract boolean method402(boolean arg0, class65 arg1);

   @OriginalMember(
      owner = "client!u",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method769(byte arg0) {
      try {
         field1007 = null;
         if (arg0 >= -58) {
            method769((byte)40);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1009[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "c",
      descriptor = "(ZLha;)Lwia;"
   )
   public abstract class794 method770(boolean arg0, class65 arg1);

   @OriginalMember(
      owner = "client!u",
      name = "c",
      descriptor = "(I)Z"
   )
   public abstract boolean method771(int arg0);

   @OriginalMember(
      owner = "client!u",
      name = "e",
      descriptor = "(I)Z"
   )
   public abstract boolean method397(int arg0);

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(Z)I"
   )
   public int method772(boolean arg0) {
      try {
         ++field996;
         if (!arg0) {
            this.method772(true);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1009[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "i",
      descriptor = "(I)I"
   )
   public abstract int method773(int arg0);

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(IIILha;)Z"
   )
   public abstract boolean method774(int arg0, int arg1, int arg2, class65 arg3);

   @OriginalMember(
      owner = "client!u",
      name = "f",
      descriptor = "(I)Z"
   )
   public abstract boolean method775(int arg0);

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(BLha;)V"
   )
   public abstract void method776(byte arg0, class65 arg1);

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method777(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(BLwm;)Len;"
   )
   public static final class339 method778(byte arg0, class594 arg1) {
      try {
         ++field995;
         if (arg0 < 103) {
            field1007 = null;
         }

         return new class339(arg1.method4333(-66), arg1.method4333(-104), arg1.method4333(-127), arg1.method4333(-85), arg1.method4333(-88), arg1.method4333(-83), arg1.method4333(-79), arg1.method4333(-85), arg1.method4293(80), arg1.method4288((byte)67));
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1009[5] + arg0 + ',' + (arg1 != null ? field1009[2] : field1009[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(Lha;I)Loi;"
   )
   public abstract class79 method779(class65 arg0, int arg1);

   @OriginalMember(
      owner = "client!u",
      name = "d",
      descriptor = "(I)Z"
   )
   public abstract boolean method780(int arg0);

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "([Loda;IBI)I"
   )
   public final int method781(class127[] arg0, int arg1, byte arg2, int arg3) {
      boolean var5 = client.field4273;

      try {
         ++field1002;
         long var6 = class328.field4698[this.field1001][arg1][arg3];
         if (arg2 > -14) {
            this.field993 = -54;
         }

         int var10;
         int var11;
         label60: {
            long var8 = 0L;
            var10 = 0;
            if (var5) {
               var11 = (int)(var6 >> (int)var8 & 65535L);
            } else if (var8 > 48L) {
               var11 = var10;
               if (!var5) {
                  break label60;
               }
            } else {
               var11 = (int)(var6 >> (int)var8 & 65535L);
            }

            label59:
            do {
               while(true) {
                  if (var11 <= 0) {
                     if (!var5) {
                        var11 = var10;
                        break;
                     }

                     var8 += 16L;
                     arg0[var10++] = class166.field2104[var11 + -1].field10676;
                  } else {
                     var8 += 16L;
                     arg0[var10++] = class166.field2104[var11 + -1].field10676;
                  }

                  if (var8 > 48L) {
                     var11 = var10;
                     if (!var5) {
                        break label59;
                     }
                  } else {
                     var11 = (int)(var6 >> (int)var8 & 65535L);
                  }
               }
            } while(var5);
         }

         if (var5) {
            arg0[var11] = null;
            ++var11;
         }

         while(true) {
            while(var11 < 4) {
               arg0[var11] = null;
               ++var11;
            }

            if (!var5) {
               return var10;
            }

            ++var11;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field1009[4] + (arg0 != null ? field1009[2] : field1009[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "g",
      descriptor = "(I)I"
   )
   public abstract int method782(int arg0);

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(ILu;IIZILha;)V"
   )
   public abstract void method783(int arg0, class80 arg1, int arg2, int arg3, boolean arg4, int arg5, class65 arg6);

   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method784(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method785(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

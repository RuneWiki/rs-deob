import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class600 {
   @OriginalMember(
      owner = "client!uo",
      name = "q",
      descriptor = "B"
   )
   public byte field8664;
   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8666 = new String[]{method4435(method4434("i(Q&\u0013")), method4435(method4434("i(Q!\u0013")), method4435(method4434("i(Q^Rr.\u000b\\\u0013")), method4435(method4434("i(Q#\u0013")), method4435(method4434("i(Q \u0013")), method4435(method4434("giQLF")), method4435(method4434("r2\u0013\u000e")), method4435(method4434("i(Q'\u0013"))};
   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "I"
   )
   public static int field8647;
   @OriginalMember(
      owner = "client!uo",
      name = "n",
      descriptor = "I"
   )
   public static int field8648;
   @OriginalMember(
      owner = "client!uo",
      name = "o",
      descriptor = "I"
   )
   public static int field8649;
   @OriginalMember(
      owner = "client!uo",
      name = "j",
      descriptor = "I"
   )
   public static int field8651;
   @OriginalMember(
      owner = "client!uo",
      name = "p",
      descriptor = "I"
   )
   public static int field8665;
   @OriginalMember(
      owner = "client!uo",
      name = "c",
      descriptor = "Lwq;"
   )
   public static class176 field8650;
   @OriginalMember(
      owner = "client!uo",
      name = "m",
      descriptor = "Lmn;"
   )
   public class383 field8658;
   @OriginalMember(
      owner = "client!uo",
      name = "g",
      descriptor = "Lmn;"
   )
   public class383 field8660;
   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "Ltb;"
   )
   public class417 field8654;
   @OriginalMember(
      owner = "client!uo",
      name = "l",
      descriptor = "Lnm;"
   )
   public class496 field8659;
   @OriginalMember(
      owner = "client!uo",
      name = "d",
      descriptor = "Lnm;"
   )
   public class496 field8661;
   @OriginalMember(
      owner = "client!uo",
      name = "i",
      descriptor = "Lqj;"
   )
   public class533 field8653;
   @OriginalMember(
      owner = "client!uo",
      name = "f",
      descriptor = "Luo;"
   )
   public class600 field8656;
   @OriginalMember(
      owner = "client!uo",
      name = "r",
      descriptor = "Lkfa;"
   )
   public class626 field8657;
   @OriginalMember(
      owner = "client!uo",
      name = "e",
      descriptor = "S"
   )
   public short field8652;
   @OriginalMember(
      owner = "client!uo",
      name = "h",
      descriptor = "S"
   )
   public short field8655;
   @OriginalMember(
      owner = "client!uo",
      name = "k",
      descriptor = "S"
   )
   public short field8662;
   @OriginalMember(
      owner = "client!uo",
      name = "s",
      descriptor = "S"
   )
   public short field8663;

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(ILbv;)V",
      line = 3
   )
   public static final void method4429(int arg0, class321 arg1) {
      boolean var2 = client.field4564;

      try {
         arg1.field4623 = null;
         if (arg0 >= -105) {
            field8647 = -34;
         }

         ++field8651;
         int var3 = arg1.field4630.length;
         int var4 = 0;
         if (var2) {
            arg1.field4630[var4].field5406 = false;
            ++var4;
         }

         while(true) {
            while(~var4 > ~var3) {
               arg1.field4630[var4].field5406 = false;
               ++var4;
            }

            class150[] var5 = class732.field10529;
            synchronized(class732.field10529) {
               if (!var2) {
                  if (~class732.field10529.length < ~var3 && class497.field7271[var3] < 200) {
                     class732.field10529[var3].method1398(true, arg1);
                     int var10002 = class497.field7271[var3]++;
                  }

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8666[7] + arg0 + ',' + (arg1 != null ? field8666[5] : field8666[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(Z)V",
      line = 34
   )
   public final void method4430(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         class533 var3;
         if (var2) {
            var3 = this.field8653.field7763;
            this.field8653.method3994(5);
            this.field8653 = var3;
         }

         while(this.field8653 != null) {
            var3 = this.field8653.field7763;
            this.field8653.method3994(5);
            this.field8653 = var3;
         }

         ++field8648;
         if (!arg0) {
            method4432(117);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8666[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(B)V",
      line = 52
   )
   public static void method4431(byte arg0) {
      try {
         if (arg0 == 96) {
            field8650 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8666[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(I)I",
      line = 62
   )
   public static final int method4432(int arg0) {
      try {
         ++field8649;
         class179 var1 = class734.field10556;
         synchronized(class734.field10556) {
            if (arg0 != 34379) {
               method4433((class124)null, (byte[])null, 109, 67);
            }

            return class734.field10556.method1593(true);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8666[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "<init>",
      descriptor = "(I)V",
      line = 79
   )
   public class600(int arg0) {
      try {
         this.field8664 = (byte)arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8666[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(Lbba;[BII)Lwj;",
      line = 87
   )
   public static final class412 method4433(class124 arg0, byte[] arg1, int arg2, int arg3) {
      try {
         ++field8665;
         if (arg1 == null) {
            return null;
         } else {
            if (arg3 != 24048) {
               method4429(-74, (class321)null);
            }

            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg2, var4);
            OpenGL.glProgramRawARB(arg2, 34933, arg1);
            OpenGL.glGetIntegerv(34379, class135.field2224, 0);
            if (~class135.field2224[0] != 0) {
               OpenGL.glBindProgramARB(arg2, 0);
               return null;
            } else {
               OpenGL.glBindProgramARB(arg2, 0);
               return new class412(arg0, arg2, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8666[4] + (arg0 != null ? field8666[5] : field8666[6]) + ',' + (arg1 != null ? field8666[5] : field8666[6]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4434(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4435(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

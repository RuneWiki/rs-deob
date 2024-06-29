import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class655 extends class546 implements class147 {
   @OriginalMember(
      owner = "client!paa",
      name = "E",
      descriptor = "I"
   )
   private int field9154 = -1;
   @OriginalMember(
      owner = "client!paa",
      name = "F",
      descriptor = "I"
   )
   private int field9166 = -1;
   @OriginalMember(
      owner = "client!paa",
      name = "w",
      descriptor = "I"
   )
   private int field9160;
   @OriginalMember(
      owner = "client!paa",
      name = "A",
      descriptor = "Lor;"
   )
   private class670 field9161;
   @OriginalMember(
      owner = "client!paa",
      name = "G",
      descriptor = "I"
   )
   public int field9164;
   @OriginalMember(
      owner = "client!paa",
      name = "H",
      descriptor = "I"
   )
   public int field9159;
   @OriginalMember(
      owner = "client!paa",
      name = "D",
      descriptor = "I"
   )
   private int field9158;
   @OriginalMember(
      owner = "client!paa",
      name = "B",
      descriptor = "I"
   )
   private int field9157;
   @OriginalMember(
      owner = "client!paa",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9168 = new String[]{method4735(method4734("mLd\r\u001a5")), method4735(method4734("mLd\r\u001b5")), method4735(method4734("mLd\r\u001d5")), method4735(method4734("mLd\r\u001c5")), method4735(method4734("mLd\r9tCdO6gH-")), method4735(method4734("mLd\rctClWa5")), method4735(method4734("f\u0003+\r\"")), method4735(method4734("sXiO")), method4735(method4734("mLd\r\u001e5")), method4735(method4734("mLd\r\u00195"))};
   @OriginalMember(
      owner = "client!paa",
      name = "y",
      descriptor = "Lbga;"
   )
   public static class378 field9155 = new class378(83, -2);
   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "I"
   )
   public static int field9153;
   @OriginalMember(
      owner = "client!paa",
      name = "t",
      descriptor = "I"
   )
   public static int field9156;
   @OriginalMember(
      owner = "client!paa",
      name = "x",
      descriptor = "I"
   )
   public static int field9162;
   @OriginalMember(
      owner = "client!paa",
      name = "v",
      descriptor = "I"
   )
   public static int field9163;
   @OriginalMember(
      owner = "client!paa",
      name = "u",
      descriptor = "I"
   )
   public static int field9165;
   @OriginalMember(
      owner = "client!paa",
      name = "C",
      descriptor = "I"
   )
   public static int field9167;

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(ZIB)Lhda;"
   )
   public static final class784 method4729(boolean arg0, int arg1, byte arg2) {
      try {
         ++field9165;
         int var3 = -43 % ((arg2 - 48) / 47);
         long var4 = (long)((!arg0 ? 0 : Integer.MIN_VALUE) | arg1);
         return (class784)class450.field6221.method1839(98, var4);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9168[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method4730(byte arg0) {
      try {
         if (~this.field9158 < -1) {
            this.field9161.method4844((byte)93, this.field9158, this.field9157);
            this.field9158 = 0;
         }

         ++field9156;
         int var2 = 125 / ((arg0 - -26) / 48);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9168[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field9163;
         this.method4730((byte)62);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9168[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V"
   )
   public static final void method4731(String arg0, String arg1, byte arg2) {
      try {
         if (arg2 > 55) {
            class619.field8658 = 1;
            class766.field11046 = -1;
            ++field9167;
            class604.field8418 = class605.field8473;
            class396.method3008(false, arg0, (byte)-86, false, arg1);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9168[9] + (arg0 != null ? field9168[6] : field9168[7]) + ',' + (arg1 != null ? field9168[6] : field9168[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method4732(int arg0) {
      try {
         if (arg0 != 3291) {
            method4731((String)null, (String)null, (byte)1);
         }

         field9155 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9168[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method317(int arg0) {
      try {
         OpenGL.glFramebufferRenderbufferEXT(this.field9166, this.field9154, 36161, arg0);
         ++field9153;
         this.field9166 = -1;
         this.field9154 = -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9168[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "<init>",
      descriptor = "(Lor;III)V"
   )
   public class655(class670 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9160 = arg1;
         this.field9161 = arg0;
         this.field9164 = arg3;
         this.field9159 = arg2;
         OpenGL.glGenRenderbuffersEXT(1, class49.field562, 0);
         this.field9158 = class49.field562[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field9158);
         OpenGL.glRenderbufferStorageEXT(36161, this.field9160, this.field9159, this.field9164);
         this.field9157 = this.field9164 * this.field9159 * this.field9161.method4893((byte)-45, this.field9160);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9168[5] + (arg0 != null ? field9168[6] : field9168[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method4733(byte arg0, int arg1, int arg2) {
      try {
         ++field9162;
         OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field9158);
         this.field9154 = arg1;
         this.field9166 = arg2;
         if (arg0 > -9) {
            method4731((String)null, (String)null, (byte)127);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9168[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "<init>",
      descriptor = "(Lor;IIII)V"
   )
   public class655(class670 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field9161 = arg0;
         this.field9159 = arg2;
         this.field9160 = arg1;
         this.field9164 = arg3;
         OpenGL.glGenRenderbuffersEXT(1, class49.field562, 0);
         this.field9158 = class49.field562[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field9158);
         OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field9160, this.field9159, this.field9164);
         this.field9157 = this.field9164 * this.field9159 * this.field9161.method4893((byte)114, this.field9160);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9168[5] + (arg0 != null ? field9168[6] : field9168[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4734(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4735(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

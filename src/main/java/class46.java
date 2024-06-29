import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class46 extends class413 implements class102 {
   @OriginalMember(
      owner = "client!vo",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1016 = new String[]{method578(method577("f[5PK")), method578(method577("f[5VK")), method578(method577("f[5WK")), method578(method577("f[5[K")), method578(method577("f[5UK")), method578(method577("~Aw}")), method578(method577("k\u001a5?\u001e")), method578(method577("f[5SK")), method578(method577("f[5YK")), method578(method577("f[5RK")), method578(method577("f[5XK")), method578(method577("f[5TK"))};
   @OriginalMember(
      owner = "client!vo",
      name = "C",
      descriptor = "[I"
   )
   public static int[] field1014 = new int[]{0, -1, 0, 1};
   @OriginalMember(
      owner = "client!vo",
      name = "D",
      descriptor = "B"
   )
   private byte field1012;
   @OriginalMember(
      owner = "client!vo",
      name = "x",
      descriptor = "I"
   )
   public static int field1004;
   @OriginalMember(
      owner = "client!vo",
      name = "F",
      descriptor = "I"
   )
   public static int field1005;
   @OriginalMember(
      owner = "client!vo",
      name = "G",
      descriptor = "I"
   )
   public static int field1006;
   @OriginalMember(
      owner = "client!vo",
      name = "w",
      descriptor = "I"
   )
   public static int field1008;
   @OriginalMember(
      owner = "client!vo",
      name = "A",
      descriptor = "I"
   )
   public static int field1009;
   @OriginalMember(
      owner = "client!vo",
      name = "v",
      descriptor = "I"
   )
   public static int field1010;
   @OriginalMember(
      owner = "client!vo",
      name = "y",
      descriptor = "I"
   )
   public static int field1011;
   @OriginalMember(
      owner = "client!vo",
      name = "H",
      descriptor = "I"
   )
   public static int field1013;
   @OriginalMember(
      owner = "client!vo",
      name = "E",
      descriptor = "I"
   )
   public static int field1015;
   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "Leo;"
   )
   public static class311 field1007;

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(ZB)Ljaclib/memory/Buffer;"
   )
   public final Buffer method567(boolean arg0, byte arg1) {
      try {
         ++field1015;
         return arg1 != 49 ? null : super.method3151(super.field6048.field2081, (byte)-121, arg0);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1016[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method568(int arg0, int arg1, int arg2) {
      try {
         ++field1009;
         if (arg0 != 22407) {
            return true;
         } else {
            this.field1012 = (byte)arg1;
            super.method2189(27288, arg2);
            return true;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1016[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method569(int arg0) {
      try {
         ++field1011;
         if (arg0 != 1571) {
            this.method573(104, -107, true, (Source)null);
         }

         return super.method3152((byte)-59, super.field6048.field2081);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1016[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method570(int arg0) {
      try {
         if (arg0 != 1) {
            this.field1012 = -28;
         }

         ++field1013;
         return super.method570(arg0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1016[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method571(byte arg0) {
      try {
         field1014 = null;
         field1007 = null;
         int var1 = -52 / ((arg0 - 9) / 56);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1016[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "<init>",
      descriptor = "(Lbba;Z)V"
   )
   public class46(class124 arg0, boolean arg1) {
      super(arg0, 34962, arg1);
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(IIIIIIIZII)V"
   )
   public static final void method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
      try {
         ++field1010;
         if (arg7) {
            method571((byte)-8);
         }

         if (class515.field7502 <= arg0 && ~class130.field2163 <= ~arg0 && arg5 >= class515.field7502 && arg5 <= class130.field2163 && ~class515.field7502 >= ~arg9 && ~class130.field2163 <= ~arg9 && ~arg3 <= ~class515.field7502 && arg3 <= class130.field2163 && arg6 >= class3.field16 && ~class581.field8354 <= ~arg6 && ~arg4 <= ~class3.field16 && arg4 <= class581.field8354 && ~arg2 <= ~class3.field16 && arg2 <= class581.field8354 && arg8 >= class3.field16 && ~arg8 >= ~class581.field8354) {
            class321.method2503(arg3, arg6, (byte)-97, arg1, arg0, arg4, arg8, arg5, arg9, arg2);
         } else {
            class344.method2662(arg0, arg2, arg5, arg4, arg8, arg3, arg9, arg1, (byte)123, arg6);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field1016[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(IIZLjaclib/memory/Source;)Z"
   )
   public final boolean method573(int arg0, int arg1, boolean arg2, Source arg3) {
      try {
         this.field1012 = (byte)arg1;
         ++field1006;
         super.method3157(arg0, -1, arg3);
         if (arg2) {
            this.method575(-91);
         }

         return true;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1016[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1016[6] : field1016[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method574(int arg0) {
      try {
         super.method574(arg0);
         if (arg0 != 29079) {
            field1014 = null;
         }

         ++field1004;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1016[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method575(int arg0) {
      try {
         ++field1005;
         return arg0 != 31294 ? 25 : this.field1012;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1016[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(ZIII[[[Luo;I)Z"
   )
   public static final boolean method576(boolean param0, int param1, int param2, int param3, class600[][][] param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method577(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method578(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

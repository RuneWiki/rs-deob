import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class394 extends class67 {
   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6181 = new String[]{method3177(method3176("WfW\u0004\u0019")), method3177(method3176("WfW\u0002\u0019")), method3177(method3176("WfW\u0006\u0019")), method3177(method3176("WfW\u0001\u0019")), method3177(method3176("WfW\u0005\u0019")), method3177(method3176("WfW\u0000\u0019")), method3177(method3176("@:WmL")), method3177(method3176("WfW\u0007\u0019")), method3177(method3176("Ua\u0015/")), method3177(method3176("WfW\u000b\u0019"))};
   @OriginalMember(
      owner = "client!lr",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field6172 = new class498(119, 17);
   @OriginalMember(
      owner = "client!lr",
      name = "k",
      descriptor = "I"
   )
   public static int field6173;
   @OriginalMember(
      owner = "client!lr",
      name = "o",
      descriptor = "I"
   )
   public static int field6174;
   @OriginalMember(
      owner = "client!lr",
      name = "r",
      descriptor = "I"
   )
   public static int field6175;
   @OriginalMember(
      owner = "client!lr",
      name = "l",
      descriptor = "I"
   )
   public static int field6176;
   @OriginalMember(
      owner = "client!lr",
      name = "q",
      descriptor = "I"
   )
   public static int field6177;
   @OriginalMember(
      owner = "client!lr",
      name = "n",
      descriptor = "I"
   )
   public static int field6178;
   @OriginalMember(
      owner = "client!lr",
      name = "p",
      descriptor = "I"
   )
   public static int field6179;
   @OriginalMember(
      owner = "client!lr",
      name = "s",
      descriptor = "I"
   )
   public static int field6180;

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field6178;
         return arg1 >= -74 ? 57 : 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6181[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class394(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lr",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class394(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public static final boolean method3172(boolean arg0, int arg1) {
      try {
         if (arg0) {
            field6172 = null;
         }

         ++field6179;
         return ~arg1 <= -13 && arg1 <= 17;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6181[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            return -7;
         } else {
            ++field6174;
            return !super.field881.method295(false).method2507((byte)-128) ? 2 : 3;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6181[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (super.field877 < 1 || super.field877 > 3) {
            super.field877 = this.method162(0);
         }

         ++field6173;
         if (arg0 != -69) {
            this.method165(105, true);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6181[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         ++field6176;
         if (!arg1) {
            field6180 = 68;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6181[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3173(int arg0) {
      try {
         if (arg0 != 480102311) {
            field6180 = 89;
         }

         ++field6177;
         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6181[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3174(int arg0) {
      try {
         field6172 = null;
         if (arg0 != -31760) {
            field6180 = -20;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6181[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(ILjava/lang/String;IIIIII)V"
   )
   public static final void method3175(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field6175;
         class338 var8 = new class338();
         var8.field5178 = arg4;
         var8.field5175 = class308.field4801 + arg0;
         var8.field5180 = arg5;
         var8.field5174 = arg3;
         var8.field5177 = arg6;
         var8.field5176 = arg1;
         var8.field5179 = arg2;
         class346.field5304.method1813(var8, 0);
         if (arg7 != 20717) {
            field6180 = -47;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6181[7] + arg0 + ',' + (arg1 != null ? field6181[6] : field6181[8]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3176(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3177(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class411 extends class67 {
   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6393 = new String[]{method3295(method3294("\bM6e\u001aN")), method3295(method3294("\bZ;'")), method3295(method3294("\u001d\u0001ye&")), method3295(method3294("\bM6e\u0013N")), method3295(method3294("\bM6e\u001eN")), method3295(method3294("\bM6e\u001dN")), method3295(method3294("\bM6e\u0018N")), method3295(method3294("\bM6e\u001cN")), method3295(method3294("\bM6e\u0019N")), method3295(method3294("\bM6e\u001fN"))};
   @OriginalMember(
      owner = "client!nba",
      name = "q",
      descriptor = "I"
   )
   public static int field6385;
   @OriginalMember(
      owner = "client!nba",
      name = "l",
      descriptor = "I"
   )
   public static int field6386;
   @OriginalMember(
      owner = "client!nba",
      name = "k",
      descriptor = "I"
   )
   public static int field6387;
   @OriginalMember(
      owner = "client!nba",
      name = "m",
      descriptor = "I"
   )
   public static int field6388;
   @OriginalMember(
      owner = "client!nba",
      name = "o",
      descriptor = "I"
   )
   public static int field6389;
   @OriginalMember(
      owner = "client!nba",
      name = "p",
      descriptor = "I"
   )
   public static int field6390;
   @OriginalMember(
      owner = "client!nba",
      name = "r",
      descriptor = "I"
   )
   public static int field6391;
   @OriginalMember(
      owner = "client!nba",
      name = "n",
      descriptor = "I"
   )
   public static int field6392;

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(Lrr;Lrr;Lrr;BLrr;)V"
   )
   public static final void method3290(class678 arg0, class678 arg1, class678 arg2, byte arg3, class678 arg4) {
      try {
         class639.field9245 = arg4;
         class452.field6915 = arg1;
         class70.field919 = arg2;
         ++field6388;
         class296.field4672 = new class374[class70.field919.method5008(-1)][];
         int var5 = 95 % ((-40 - arg3) / 56);
         class14.field181 = new boolean[class70.field919.method5008(-1)];
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6393[0] + (arg0 != null ? field6393[2] : field6393[1]) + ',' + (arg1 != null ? field6393[2] : field6393[1]) + ',' + (arg2 != null ? field6393[2] : field6393[1]) + ',' + arg3 + ',' + (arg4 != null ? field6393[2] : field6393[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(IZIIIIZ)V"
   )
   public static final void method3291(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      try {
         if (~(!arg6 ? class687.field10213.field509.method1774(480102311) : class687.field10213.field542.method1774(480102311)) != -1 && arg2 != 0 && ~class465.field7069 > -51 && ~arg0 != 0) {
            class207.field3159[class465.field7069++] = new class760((byte)(!arg6 ? 2 : 3), arg0, arg2, arg4, arg3, 0, arg5, (class109)null);
         }

         ++field6385;
         if (!arg1) {
            method3292(-86);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6393[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method3292(int arg0) {
      try {
         ++field6386;
         if (class552.field8264) {
            if (arg0 != 2827) {
               method3292(-1);
            }

            class374 var1 = class221.method1912(class175.field2750, -62, class105.field1459);
            if (var1 != null && var1.field5930 != null) {
               class36 var2 = new class36();
               var2.field441 = var1;
               var2.field437 = var1.field5930;
               class469.method3632(var2);
            }

            class436.field6683 = -1;
            class449.field6882 = -1;
            class552.field8264 = false;
            if (var1 != null) {
               class573.method4310((byte)-113, var1);
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6393[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         ++field6391;
         if (!arg1) {
            this.method158((byte)-48);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6393[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (super.field877 < 0 && ~super.field877 < -5) {
            super.field877 = this.method162(0);
         }

         if (arg0 == -69) {
            ++field6389;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6393[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method3293(int arg0) {
      try {
         if (arg0 != 480102311) {
            return -78;
         } else {
            ++field6387;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6393[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         ++field6392;
         if (arg0 != 0) {
            return -10;
         } else {
            return super.field881.method295(false).method2509(-94) > 1 ? 4 : 2;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6393[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class411(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         if (arg1 >= -74) {
            return -61;
         } else {
            ++field6390;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6393[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class411(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3294(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3295(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

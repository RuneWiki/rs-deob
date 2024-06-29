import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class300 extends class731 {
   @OriginalMember(
      owner = "client!ol",
      name = "K",
      descriptor = "S"
   )
   public short field4100;
   @OriginalMember(
      owner = "client!ol",
      name = "F",
      descriptor = "S"
   )
   public short field4105;
   @OriginalMember(
      owner = "client!ol",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4108 = new String[]{method2242(method2241("L\n\f26")), method2242(method2241("YQNp")), method2242(method2241("tE@~*PA")), method2242(method2241("XH\fSc")), method2242(method2241("XH\fRc")), method2242(method2241("XH\fYc")), method2242(method2241("XH\fWc")), method2242(method2241("XH\f_c")), method2242(method2241("XH\f[c")), method2242(method2241("XH\fTc")), method2242(method2241("XH\fLc")), method2242(method2241("XH\f \"YMV\"c")), method2242(method2241("XH\fZc"))};
   @OriginalMember(
      owner = "client!ol",
      name = "C",
      descriptor = "Leg;"
   )
   public static class118 field4102 = new class118(142, -2);
   @OriginalMember(
      owner = "client!ol",
      name = "G",
      descriptor = "I"
   )
   public static int field4097;
   @OriginalMember(
      owner = "client!ol",
      name = "I",
      descriptor = "I"
   )
   public static int field4098;
   @OriginalMember(
      owner = "client!ol",
      name = "H",
      descriptor = "I"
   )
   public static int field4099;
   @OriginalMember(
      owner = "client!ol",
      name = "E",
      descriptor = "I"
   )
   public static int field4101;
   @OriginalMember(
      owner = "client!ol",
      name = "A",
      descriptor = "I"
   )
   public static int field4103;
   @OriginalMember(
      owner = "client!ol",
      name = "J",
      descriptor = "I"
   )
   public static int field4104;
   @OriginalMember(
      owner = "client!ol",
      name = "B",
      descriptor = "I"
   )
   public static int field4106;
   @OriginalMember(
      owner = "client!ol",
      name = "D",
      descriptor = "Lifa;"
   )
   public static class453 field4107;

   @OriginalMember(
      owner = "client!ol",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method241(byte arg0) {
      try {
         if (arg0 > -9) {
            this.method239(true);
         }

         ++field4103;
         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4108[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(Lha;ZLgn;IIII)V"
   )
   public final void method233(class66 arg0, boolean arg1, class731 arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg6 > -125) {
            this.method1764((byte)-53);
         }

         ++field4099;
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field4108[9] + (arg0 != null ? field4108[0] : field4108[1]) + ',' + arg1 + ',' + (arg2 != null ? field4108[0] : field4108[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method239(boolean arg0) {
      try {
         if (!arg0) {
            return true;
         } else {
            ++field4097;
            return false;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4108[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(ZLha;)Z"
   )
   public final boolean method1762(boolean arg0, class66 arg1) {
      try {
         if (arg0) {
            method2240(-115);
         }

         ++field4106;
         return class228.method1775(-1, super.field10702, super.field10694 >> class773.field11359, super.field10693 >> class773.field11359, this.method232(-101));
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4108[5] + arg0 + ',' + (arg1 != null ? field4108[0] : field4108[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(II)I"
   )
   public static int method2238(int arg0, int arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4108[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "i",
      descriptor = "(B)Z"
   )
   public final boolean method1764(byte arg0) {
      try {
         if (arg0 != -78) {
            return false;
         } else {
            ++field4104;
            return class506.field7334[(super.field10694 >> class773.field11359) + class106.field1335 + -class712.field10385][(super.field10693 >> class773.field11359) - -class106.field1335 + -class377.field5453];
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4108[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(IILwf;)Ljava/lang/String;"
   )
   public static final String method2239(int arg0, int arg1, class147 arg2) {
      try {
         ++field4098;

         try {
            int var3 = arg2.method1145((byte)31);
            if (arg0 < var3) {
               var3 = arg0;
            }

            byte[] var4 = new byte[var3];
            arg2.field1856 += class566.field8070.method5519(arg2.field1856, var3, 0, var4, arg2.field1889, (byte)111);
            String var5 = class405.method3054(0, var3, 60, var4);
            int var6 = -20 % ((arg1 - 31) / 50);
            return var5;
         } catch (Exception var8) {
            return field4108[2];
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field4108[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4108[0] : field4108[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method2240(int arg0) {
      try {
         if (arg0 != 4879) {
            field4107 = null;
         }

         field4107 = null;
         field4102 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4108[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "([Lmn;Z)I"
   )
   public final int method1763(class389[] arg0, boolean arg1) {
      try {
         ++field4101;
         return !arg1 ? -105 : this.method5323(super.field10694 >> class773.field11359, -102, super.field10693 >> class773.field11359, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4108[8] + (arg0 != null ? field4108[0] : field4108[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field4100 = (short)arg5;
         super.field10693 = arg2;
         super.field10697 = arg1;
         super.field10701 = (byte)arg3;
         this.field4105 = (short)arg6;
         super.field10702 = (byte)arg4;
         super.field10694 = arg0;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field4108[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2241(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2242(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

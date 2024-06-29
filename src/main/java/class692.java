import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class692 extends class426 {
   @OriginalMember(
      owner = "client!bca",
      name = "l",
      descriptor = "I"
   )
   private int field10106;
   @OriginalMember(
      owner = "client!bca",
      name = "g",
      descriptor = "I"
   )
   private int field10102;
   @OriginalMember(
      owner = "client!bca",
      name = "o",
      descriptor = "I"
   )
   private int field10109;
   @OriginalMember(
      owner = "client!bca",
      name = "m",
      descriptor = "I"
   )
   private int field10101;
   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10111 = new String[]{method5034(method5033("%~\u0005F#.s\r\u001c!o")), method5034(method5033("%~\u0005F[o")), method5034(method5033("%~\u0005F\\o")), method5034(method5033("%~\u0005F^o")), method5034(method5033("%~\u0005F]o")), method5034(method5033("%~\u0005FZo"))};
   @OriginalMember(
      owner = "client!bca",
      name = "j",
      descriptor = "I"
   )
   public static int field10105 = 0;
   @OriginalMember(
      owner = "client!bca",
      name = "n",
      descriptor = "I"
   )
   public static int field10103;
   @OriginalMember(
      owner = "client!bca",
      name = "i",
      descriptor = "I"
   )
   public static int field10104;
   @OriginalMember(
      owner = "client!bca",
      name = "h",
      descriptor = "I"
   )
   public static int field10107;
   @OriginalMember(
      owner = "client!bca",
      name = "k",
      descriptor = "I"
   )
   public static int field10108;
   @OriginalMember(
      owner = "client!bca",
      name = "p",
      descriptor = "I"
   )
   public static int field10110;

   @OriginalMember(
      owner = "client!bca",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field10106 = arg3;
         this.field10102 = arg0;
         this.field10109 = arg1;
         this.field10101 = arg2;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10111[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method5031(int arg0) {
      try {
         ++field10110;
         if (arg0 == 3) {
            if (~class674.field9907.field8458.method2628((byte)-95) == -1 && ~class316.field4223 != ~class239.field2981) {
               class778.method5571(class270.field3503, false, 12, class446.field6176, false);
            } else {
               class257.method1967((byte)122, class338.field4832);
               if (class501.field6882 != class239.field2981) {
                  class643.method4643(115);
               }
            }
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10111[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method2689(int arg0, int arg1, byte arg2) {
      try {
         ++field10107;
         if (arg2 != 109) {
            method5031(15);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10111[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(IIIIIII)Z"
   )
   public static final boolean method5032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field10104;
         int var7 = arg2 + arg4;
         int var8 = arg0 - -arg3;
         if (arg5 != 862921836) {
            return false;
         } else {
            int var9 = arg6 - -arg1;
            if (!class432.method3235(arg6, var9, var8, arg4, var9, var8, true, arg4, var7, var8)) {
               return false;
            } else if (!class432.method3235(arg6, var9, var8, var7, arg6, var8, true, arg4, var7, var8)) {
               return false;
            } else {
               if (~arg4 > ~class273.field3647) {
                  if (!class432.method3235(var9, var9, var8, arg4, arg6, var8, true, arg4, arg4, arg0)) {
                     return false;
                  }

                  if (!class432.method3235(var9, arg6, arg0, arg4, arg6, var8, true, arg4, arg4, arg0)) {
                     return false;
                  }
               } else {
                  if (!class432.method3235(var9, var9, var8, var7, arg6, var8, true, var7, var7, arg0)) {
                     return false;
                  }

                  if (!class432.method3235(var9, arg6, arg0, var7, arg6, var8, true, var7, var7, arg0)) {
                     return false;
                  }
               }

               if (class228.field2852 > arg6) {
                  if (!class432.method3235(arg6, arg6, var8, arg4, arg6, var8, true, arg4, var7, arg0)) {
                     return false;
                  }

                  if (!class432.method3235(arg6, arg6, arg0, var7, arg6, var8, true, arg4, var7, arg0)) {
                     return false;
                  }
               } else {
                  if (!class432.method3235(var9, var9, var8, arg4, var9, var8, true, arg4, var7, arg0)) {
                     return false;
                  }

                  if (!class432.method3235(var9, var9, arg0, var7, var9, var8, true, arg4, var7, arg0)) {
                     return false;
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field10111[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method2688(byte arg0, int arg1, int arg2) {
      try {
         ++field10108;
         int var4 = this.field10102 * arg1 >> 12;
         int var5 = this.field10101 * arg1 >> 12;
         if (arg0 != 41) {
            this.field10101 = -76;
         }

         int var6 = this.field10109 * arg2 >> 12;
         int var7 = this.field10106 * arg2 >> 12;
         class576.method4144(var5, false, var7, var6, super.field5958, var4);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10111[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2691(int arg0, int arg1, int arg2) {
      try {
         ++field10103;
         int var4 = this.field10102 * arg1 >> 12;
         int var5 = this.field10101 * arg1 >> 12;
         int var6 = this.field10109 * arg0 >> 12;
         if (arg2 == 553) {
            int var7 = this.field10106 * arg0 >> 12;
            class153.method1257(super.field5958, var6, super.field5959, var5, var7, var4, super.field5957, -1997187742);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10111[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5033(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5034(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

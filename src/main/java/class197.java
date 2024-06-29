import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class197 {
   @OriginalMember(
      owner = "client!qt",
      name = "e",
      descriptor = "Lsf;"
   )
   private class475 field3038;
   @OriginalMember(
      owner = "client!qt",
      name = "j",
      descriptor = "I"
   )
   private int field3041;
   @OriginalMember(
      owner = "client!qt",
      name = "f",
      descriptor = "I"
   )
   private int field3044;
   @OriginalMember(
      owner = "client!qt",
      name = "c",
      descriptor = "Let;"
   )
   private class389 field3032;
   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3047 = new String[]{method1744(method1743("~\u0015\u0006h")), method1744(method1743("kND*[")), method1744(method1743("a\u0014DC\u000e")), method1744(method1743("a\u0014DE\u000e")), method1744(method1743("a\u0014DB\u000e")), method1744(method1743("a\u0014D8O~\t\u001e:\u000e")), method1744(method1743("a\u0014D@\u000e")), method1744(method1743("a\u0014DO\u000e")), method1744(method1743("a\u0014DA\u000e")), method1744(method1743("a\u0014DF\u000e")), method1744(method1743("c^\tw")), method1744(method1743("a\u0014DG\u000e")), method1744(method1743("a\u0014DL\u000e")), method1744(method1743("a\u0014DN\u000e")), method1744(method1743("a\u0014DM\u000e"))};
   @OriginalMember(
      owner = "client!qt",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field3035 = false;
   @OriginalMember(
      owner = "client!qt",
      name = "l",
      descriptor = "I"
   )
   public static int field3031;
   @OriginalMember(
      owner = "client!qt",
      name = "g",
      descriptor = "I"
   )
   public static int field3033;
   @OriginalMember(
      owner = "client!qt",
      name = "n",
      descriptor = "I"
   )
   public static int field3034;
   @OriginalMember(
      owner = "client!qt",
      name = "k",
      descriptor = "I"
   )
   public static int field3036;
   @OriginalMember(
      owner = "client!qt",
      name = "b",
      descriptor = "I"
   )
   public static int field3037;
   @OriginalMember(
      owner = "client!qt",
      name = "d",
      descriptor = "I"
   )
   public static int field3039;
   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "I"
   )
   public static int field3040;
   @OriginalMember(
      owner = "client!qt",
      name = "h",
      descriptor = "I"
   )
   public static int field3042;
   @OriginalMember(
      owner = "client!qt",
      name = "o",
      descriptor = "I"
   )
   public static int field3043;
   @OriginalMember(
      owner = "client!qt",
      name = "m",
      descriptor = "I"
   )
   public static int field3045;
   @OriginalMember(
      owner = "client!qt",
      name = "p",
      descriptor = "I"
   )
   public static int field3046;

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(Lic;B)Ljava/lang/Object;"
   )
   public final Object method1732(class51 arg0, byte arg1) {
      boolean var3 = client.field1786;

      try {
         ++field3037;
         long var4 = arg0.method350(-10416);
         class539 var6 = (class539)this.field3032.method3141(var4, true);
         byte var10000;
         if (var3) {
            var10000 = var6.field8130.method349(arg0, true);
         } else if (var6 == null) {
            var10000 = arg1;
            if (!var3) {
               if (arg1 != 124) {
                  field3035 = false;
               }

               return null;
            }
         } else {
            var10000 = var6.field8130.method349(arg0, true);
         }

         Object var7;
         while(true) {
            if (var10000 != 0) {
               var7 = var6.method4123((byte)86);
               if (var7 != null) {
                  break;
               }

               var6.method2477(1976);
               var6.method2495(-24134);
               this.field3041 += var6.field8128;
               if (var3) {
                  break;
               }
            }

            var6 = (class539)this.field3032.method3148(109);
            if (var6 == null) {
               var10000 = arg1;
               if (!var3) {
                  if (arg1 != 124) {
                     field3035 = false;
                  }

                  return null;
               }
            } else {
               var10000 = var6.field8130.method349(arg0, true);
            }
         }

         if (var6.method4124((byte)101)) {
            class708 var8 = new class708(arg0, var7, var6.field8128);
            this.field3032.method3143(124, var8, var6.field4655);
            this.field3038.method3693(var8, true);
            var8.field4684 = 0L;
            var6.method2477(arg1 + 1852);
            var6.method2495(-24134);
            if (!var3) {
               return var7;
            }
         }

         this.field3038.method3693(var6, true);
         var6.field4684 = 0L;
         return var7;
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3047[9] + (arg0 != null ? field3047[1] : field3047[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(ILic;Ljava/lang/Object;)V"
   )
   public final void method1733(int arg0, class51 arg1, Object arg2) {
      try {
         ++field3039;
         if (arg0 != -10428) {
            this.method1736((class51)null, false);
         }

         this.method1740(-1, 1, arg2, arg1);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3047[2] + arg0 + ',' + (arg1 != null ? field3047[1] : field3047[0]) + ',' + (arg2 != null ? field3047[1] : field3047[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1734(int arg0) {
      try {
         ++field3043;
         if (arg0 != 19395) {
            this.method1738(-106, (class539)null);
         }

         return this.field3041;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3047[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method1735(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(Lic;Z)V"
   )
   private final void method1736(class51 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(IIIIIZII)V"
   )
   public static final void method1737(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
      try {
         if ((!arg5 ? class687.field10213.field509.method1774(480102311) : class687.field10213.field542.method1774(480102311)) != 0 && ~arg3 != -1 && ~class465.field7069 > -51 && ~arg4 != 0) {
            class207.field3159[class465.field7069++] = new class760((byte)(arg5 ? 3 : 2), arg4, arg3, arg7, arg2, arg0, arg1, (class109)null);
         }

         int var8 = 42 / ((arg6 - 37) / 53);
         ++field3033;
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3047[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(ILmk;)V"
   )
   private final void method1738(int arg0, class539 arg1) {
      try {
         if (arg0 != 0) {
            this.field3044 = -37;
         }

         ++field3042;
         if (arg1 != null) {
            arg1.method2477(arg0 + 1976);
            arg1.method2495(-24134);
            this.field3041 += arg1.field8128;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3047[6] + arg0 + ',' + (arg1 != null ? field3047[1] : field3047[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1739(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(IILjava/lang/Object;Lic;)V"
   )
   private final void method1740(int arg0, int arg1, Object arg2, class51 arg3) {
      boolean var5 = client.field1786;

      RuntimeException var10000;
      label49: {
         boolean var10001;
         try {
            ++field3036;
            if (~this.field3044 > ~arg1) {
               throw new IllegalStateException(field3047[10]);
            }

            this.method1736(arg3, false);
            this.field3041 -= arg1;
            if (arg0 != -1) {
               return;
            }
         } catch (RuntimeException var10) {
            var10000 = var10;
            var10001 = false;
            break label49;
         }

         while(true) {
            class539 var6;
            label44: {
               try {
                  if (this.field3041 < 0) {
                     var6 = (class539)this.field3038.method3692((byte)46);
                     break label44;
                  }

                  var6 = new class708(arg3, arg2, arg1);
                  this.field3032.method3143(103, var6, arg3.method350(-10416));
                  this.field3038.method3693(var6, true);
                  var6.field4684 = 0L;
               } catch (RuntimeException var9) {
                  var10000 = var9;
                  var10001 = false;
                  break;
               }

               if (!var5) {
                  return;
               }
            }

            try {
               this.method1738(0, var6);
            } catch (RuntimeException var8) {
               var10000 = var8;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var7 = var10000;
      throw class482.method3757(var7, field3047[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3047[1] : field3047[0]) + ',' + (arg3 != null ? field3047[1] : field3047[0]) + ')');
   }

   @OriginalMember(
      owner = "client!qt",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class197(int arg0) {
      boolean var2 = client.field1786;
      super();
      this.field3038 = new class475();

      try {
         this.field3041 = arg0;
         this.field3044 = arg0;
         int var3 = 1;
         if (var2) {
            var3 += var3;
         }

         while(~arg0 < ~(var3 + var3)) {
            var3 += var3;
         }

         this.field3032 = new class389(var3);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3047[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1741(int arg0) {
      try {
         this.field3038.method3696(79);
         ++field3046;
         this.field3032.method3149(-48);
         this.field3041 = this.field3044;
         if (arg0 < 7) {
            this.method1735(-93);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3047[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1742(int arg0) {
      try {
         ++field3045;
         int var2 = 93 / ((arg0 - -55) / 36);
         return this.field3044;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3047[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1743(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1744(char[] arg0) {
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
            var10005 = 96;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

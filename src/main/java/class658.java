import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class658 extends class329 {
   @OriginalMember(
      owner = "client!er",
      name = "v",
      descriptor = "Lc;"
   )
   private class652 field9830;
   @OriginalMember(
      owner = "client!er",
      name = "t",
      descriptor = "I"
   )
   private int field9827;
   @OriginalMember(
      owner = "client!er",
      name = "n",
      descriptor = "I"
   )
   private int field9834;
   @OriginalMember(
      owner = "client!er",
      name = "x",
      descriptor = "I"
   )
   private int field9832;
   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "I"
   )
   private int field9839;
   @OriginalMember(
      owner = "client!er",
      name = "m",
      descriptor = "I"
   )
   private int field9835;
   @OriginalMember(
      owner = "client!er",
      name = "p",
      descriptor = "I"
   )
   private int field9833;
   @OriginalMember(
      owner = "client!er",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9841 = new String[]{method4851(method4850("l\n\u000e|")), method4851(method4850("yQL>\u000b")), method4851(method4850("g\rLS^")), method4851(method4850("g\rLR^")), method4851(method4850("g\rL,\u001fl\u0016\u0016.^")), method4851(method4850("g\rLQ^"))};
   @OriginalMember(
      owner = "client!er",
      name = "r",
      descriptor = "Lhka;"
   )
   public static class377 field9828 = new class377(13, -1);
   @OriginalMember(
      owner = "client!er",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field9836 = false;
   @OriginalMember(
      owner = "client!er",
      name = "s",
      descriptor = "Lnaa;"
   )
   public static class113 field9831 = new class113(63, 12);
   @OriginalMember(
      owner = "client!er",
      name = "l",
      descriptor = "Lgv;"
   )
   public static class12 field9840 = new class12(method4851(method4850("U+5Y&")), method4851(method4850("m\u0019\u0004y\u0015g")), method4851(method4850("]\b\u000b`")), 3);
   @OriginalMember(
      owner = "client!er",
      name = "w",
      descriptor = "I"
   )
   public static int field9826;
   @OriginalMember(
      owner = "client!er",
      name = "u",
      descriptor = "I"
   )
   public static int field9837;
   @OriginalMember(
      owner = "client!er",
      name = "y",
      descriptor = "I"
   )
   public static int field9838;
   @OriginalMember(
      owner = "client!er",
      name = "q",
      descriptor = "Lps;"
   )
   private class553 field9829;

   @OriginalMember(
      owner = "client!er",
      name = "c",
      descriptor = "(I)Lps;"
   )
   public final class553 method2683(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field9837;
         if (arg0 < 38) {
            this.field9827 = 46;
         }

         if (this.field9829 == null) {
            class150 var3;
            byte var4;
            int var5;
            int var9;
            label88: {
               class35.field420[3] = this.field9833;
               class35.field420[0] = this.field9832;
               class35.field420[2] = this.field9835;
               var3 = this.field9830.field8891;
               class35.field420[5] = this.field9827;
               class35.field420[1] = this.field9839;
               class35.field420[4] = this.field9834;
               var4 = 0;
               var5 = 0;
               int var6 = 0;
               if (var2) {
                  if (!var3.method1372(-111, class35.field420[var6])) {
                     return null;
                  }
               } else if (~var6 <= -7) {
                  var9 = 0;
                  if (!var2) {
                     break label88;
                  }
               } else if (!var3.method1372(-111, class35.field420[var6])) {
                  return null;
               }

               while(true) {
                  class453 var7 = var3.method1373(class35.field420[var6], (byte)-54);
                  int var8 = var7.field6933 ? 64 : 128;
                  if (~var7.field6936 < -1) {
                     var4 = 1;
                  }

                  if (~var5 > ~var8) {
                     var5 = var8;
                  }

                  ++var6;
                  if (~var6 <= -7) {
                     var9 = 0;
                     if (!var2) {
                        break;
                     }
                  } else if (!var3.method1372(-111, class35.field420[var6])) {
                     return null;
                  }
               }
            }

            if (var2) {
               class20.field249[var9] = var3.method1375(var5, 1.0F, false, var5, class35.field420[var9], -9197);
               ++var9;
            }

            while(true) {
               while(~var9 > -7) {
                  class20.field249[var9] = var3.method1375(var5, 1.0F, false, var5, class35.field420[var9], -9197);
                  ++var9;
               }

               if (!var2) {
                  this.field9829 = new class553(this.field9830, 6407, var5, ~var4 != -1, class20.field249);
                  break;
               }

               ++var9;
            }
         }

         return this.field9829;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field9841[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(ILuaa;)I"
   )
   public static final int method4848(int arg0, class119 arg1) {
      try {
         ++field9826;
         if (~arg1.field1677 == -1) {
            return 0;
         } else {
            if (arg1.field1649 != -1) {
               class119 var2 = null;
               if (~arg1.field1649 > -32769) {
                  class795 var3 = (class795)class501.field7665.method3141((long)arg1.field1649, true);
                  if (var3 != null) {
                     var2 = var3.field11592;
                  }
               } else if (arg1.field1649 >= 32768) {
                  var2 = class484.field7370[arg1.field1649 + -32768];
               }

               if (var2 != null) {
                  int var4 = -var2.field1505 + arg1.field1505;
                  int var5 = -var2.field1494 + arg1.field1494;
                  if (~var4 != -1 || ~var5 != -1) {
                     arg1.method1106(16383 & (int)(2607.5945876176133D * Math.atan2((double)var4, (double)var5)), (byte)6);
                  }
               }
            }

            if (arg1 instanceof class9) {
               class9 var6 = (class9)arg1;
               if (var6.field105 == -1 || var6.field1688 != 0 && ~var6.field1682 >= -1) {
                  return arg0 != -31138 ? -75 : arg1.method1099((byte)48);
               }

               var6.method1106(var6.field105, (byte)117);
               var6.field105 = -1;
               if (!client.field1786) {
                  return arg0 != -31138 ? -75 : arg1.method1099((byte)48);
               }
            }

            if (arg1 instanceof class466) {
               class466 var7 = (class466)arg1;
               if (~var7.field7085 != 0 && (~var7.field1688 == -1 || var7.field1682 > 0)) {
                  int var8 = -((-class120.field1694 + var7.field7085 - class120.field1694) * 256) + var7.field1505;
                  int var9 = var7.field1494 - (-class119.field1606 + var7.field7080 - class119.field1606) * 256;
                  if (var8 != 0 || ~var9 != -1) {
                     var7.method1106(16383 & (int)(2607.5945876176133D * Math.atan2((double)var8, (double)var9)), (byte)57);
                  }

                  var7.field7085 = -1;
               }
            }

            return arg0 != -31138 ? -75 : arg1.method1099((byte)48);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field9841[2] + arg0 + ',' + (arg1 != null ? field9841[1] : field9841[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4849(byte arg0) {
      try {
         if (arg0 > 87) {
            field9831 = null;
            field9828 = null;
            field9840 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9841[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "<init>",
      descriptor = "(Lc;IIIIII)V"
   )
   public class658(class652 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field9830 = arg0;
         this.field9827 = arg6;
         this.field9834 = arg5;
         this.field9832 = arg1;
         this.field9839 = arg2;
         this.field9835 = arg3;
         this.field9833 = arg4;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9841[4] + (arg0 != null ? field9841[1] : field9841[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4850(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4851(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class791 {
   @OriginalMember(
      owner = "client!jk",
      name = "m",
      descriptor = "S"
   )
   public short field11566;
   @OriginalMember(
      owner = "client!jk",
      name = "f",
      descriptor = "B"
   )
   public byte field11576;
   @OriginalMember(
      owner = "client!jk",
      name = "t",
      descriptor = "I"
   )
   public int field11564;
   @OriginalMember(
      owner = "client!jk",
      name = "k",
      descriptor = "I"
   )
   public int field11567;
   @OriginalMember(
      owner = "client!jk",
      name = "n",
      descriptor = "Z"
   )
   public boolean field11560;
   @OriginalMember(
      owner = "client!jk",
      name = "j",
      descriptor = "S"
   )
   public short field11568;
   @OriginalMember(
      owner = "client!jk",
      name = "l",
      descriptor = "S"
   )
   public short field11570;
   @OriginalMember(
      owner = "client!jk",
      name = "q",
      descriptor = "I"
   )
   public int field11559;
   @OriginalMember(
      owner = "client!jk",
      name = "i",
      descriptor = "I"
   )
   public int field11569;
   @OriginalMember(
      owner = "client!jk",
      name = "s",
      descriptor = "I"
   )
   public int field11563;
   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11581 = new String[]{method5716(method5715("=F\u00171t")), method5716(method5715("=F\u00170t")), method5716(method5715(",\u0003\u0017\\!")), method5716(method5715("9XU\u001e")), method5716(method5715("=F\u00177t")), method5716(method5715("=F\u00176t")), method5716(method5715("=F\u0017N59DMLt")), method5716(method5715("=F\u00173t"))};
   @OriginalMember(
      owner = "client!jk",
      name = "r",
      descriptor = "Lpo;"
   )
   public static class372 field11561 = new class372(128);
   @OriginalMember(
      owner = "client!jk",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field11577 = new int[13];
   @OriginalMember(
      owner = "client!jk",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field11575 = new int[1000];
   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field11574 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!jk",
      name = "o",
      descriptor = "I"
   )
   public static int field11562;
   @OriginalMember(
      owner = "client!jk",
      name = "d",
      descriptor = "I"
   )
   public static int field11565;
   @OriginalMember(
      owner = "client!jk",
      name = "v",
      descriptor = "I"
   )
   public static int field11571;
   @OriginalMember(
      owner = "client!jk",
      name = "e",
      descriptor = "I"
   )
   public static int field11572;
   @OriginalMember(
      owner = "client!jk",
      name = "h",
      descriptor = "I"
   )
   public static int field11573;
   @OriginalMember(
      owner = "client!jk",
      name = "b",
      descriptor = "I"
   )
   public static int field11580;
   @OriginalMember(
      owner = "client!jk",
      name = "g",
      descriptor = "Lww;"
   )
   public static class339 field11579;
   @OriginalMember(
      owner = "client!jk",
      name = "u",
      descriptor = "Lwc;"
   )
   public static class394 field11578;

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(IIIIILha;IZ)V"
   )
   public static final void method5710(int arg0, int arg1, int arg2, int arg3, int arg4, class479 arg5, int arg6, boolean arg7) {
      try {
         arg5.method3643(arg7, arg4, arg0, arg1, arg3, arg2);
         ++field11565;
         arg5.method3643(arg7, arg4 + 1, arg6, arg1 + 1, arg3 - 2, 16);
         arg5.method3645(arg2 + -19, arg1 + 1, arg6, arg3 + -2, (byte)100, arg4 + 18);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field11581[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field11581[2] : field11581[3]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method5711(int arg0, boolean arg1) {
      try {
         ++field11562;
         class487 var2 = class2.method12((long)arg0, 1, (byte)43);
         if (!arg1) {
            var2.method3696(-11118);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11581[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5712(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field1481;

      try {
         ++field11572;
         class731 var8;
         if (~arg0 != -9 && ~arg0 != -17) {
            var8 = class548.field8080[arg1][arg2][arg3];
            if (var8 != null) {
               label135: {
                  if (arg0 != 1) {
                     if (arg0 != 2) {
                        break label135;
                     }

                     var8.field10645 = 0;
                     if (!var5) {
                        break label135;
                     }
                  }

                  var8.field10648 = 0;
               }
            }

            class254.method2043(1);
         } else {
            int var6 = 0;
            if (!var5 && ~var6 <= ~class367.field5120) {
               if (var5) {
                  var8 = class548.field8080[arg1][arg2][arg3];
                  if (var8 != null) {
                     label136: {
                        if (arg0 != 1) {
                           if (arg0 != 2) {
                              break label136;
                           }

                           var8.field10645 = 0;
                           if (!var5) {
                              break label136;
                           }
                        }

                        var8.field10648 = 0;
                     }
                  }

                  class254.method2043(1);
               }
            } else {
               while(true) {
                  class529 var7 = class37.field532[var6];
                  if (~var7.field7409 == ~arg0 && ~var7.field7420 == ~arg2 && ~var7.field7408 == ~arg3 || var7.field7411 == arg2 && var7.field7408 == arg3) {
                     if (~class367.field5120 != ~var6) {
                        class349.method2758(class37.field532, var6 + 1, class37.field532, var6, -var6 - (1 - class37.field532.length));
                     }

                     --class367.field5120;
                     return;
                  }

                  ++var6;
                  if (~var6 <= ~class367.field5120) {
                     if (!var5) {
                        break;
                     }

                     var8 = class548.field8080[arg1][arg2][arg3];
                     if (var8 != null) {
                        label137: {
                           if (arg0 != 1) {
                              if (arg0 != 2) {
                                 break label137;
                              }

                              var8.field10645 = 0;
                              if (!var5) {
                                 break label137;
                              }
                           }

                           var8.field10648 = 0;
                        }
                     }

                     class254.method2043(1);
                     break;
                  }
               }
            }
         }

         if (arg4 != 22525) {
            field11574 = null;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field11581[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5713(int arg0) {
      try {
         field11578 = null;
         field11577 = null;
         field11579 = null;
         field11561 = null;
         field11574 = null;
         field11575 = null;
         if (arg0 != 1) {
            method5710(78, -52, -9, -6, -57, (class479)null, 63, true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11581[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field11566 = (short)arg4;
         this.field11576 = (byte)arg8;
         this.field11564 = arg1;
         this.field11567 = arg3;
         this.field11560 = arg10;
         this.field11568 = (short)arg6;
         this.field11570 = (short)arg5;
         this.field11559 = arg11;
         this.field11569 = arg2;
         this.field11563 = arg0;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field11581[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method5714(int arg0, int arg1, int arg2, int arg3) {
      try {
         class245.field3092 = new byte[arg3][arg1][arg0];
         ++field11573;
         if (arg2 < 115) {
            method5712(93, 2, 99, 45, 72);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11581[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5715(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5716(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

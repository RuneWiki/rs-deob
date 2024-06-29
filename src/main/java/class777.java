import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class777 extends class330 {
   @OriginalMember(
      owner = "client!io",
      name = "A",
      descriptor = "Lrca;"
   )
   public class37 field11325 = new class37();
   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "Lmk;"
   )
   public class360 field11330 = new class360();
   @OriginalMember(
      owner = "client!io",
      name = "t",
      descriptor = "Lst;"
   )
   private class706 field11318;
   @OriginalMember(
      owner = "client!io",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11332 = new String[]{method5616(method5615("\u0002\u0005\u0012w\r")), method5616(method5615("\u0002\u0005\u0012{\r")), method5616(method5615("\u0010D\u0012\u0011X")), method5616(method5615("\u0005\u001fPS")), method5616(method5615("\u0002\u0005\u0012r\r")), method5616(method5615("\u0002\u0005\u0012}\r")), method5616(method5615("\u0002\u0005\u0012z\r")), method5616(method5615("\u0002\u0005\u0012\u0003L\u0005\u0003H\u0001\r")), method5616(method5615("\u0002\u0005\u0012x\r")), method5616(method5615("\u0002\u0005\u0012ydC")), method5616(method5615("\u0002\u0005\u0012|\r")), method5616(method5615("\u0002\u0005\u0012~\r")), method5616(method5615("\u0002\u0005\u0012j\r"))};
   @OriginalMember(
      owner = "client!io",
      name = "y",
      descriptor = "Laka;"
   )
   public static class418 field11326 = new class418(93, 7);
   @OriginalMember(
      owner = "client!io",
      name = "C",
      descriptor = "I"
   )
   public static int field11319;
   @OriginalMember(
      owner = "client!io",
      name = "D",
      descriptor = "I"
   )
   public static int field11320;
   @OriginalMember(
      owner = "client!io",
      name = "p",
      descriptor = "I"
   )
   public static int field11321;
   @OriginalMember(
      owner = "client!io",
      name = "r",
      descriptor = "I"
   )
   public static int field11322;
   @OriginalMember(
      owner = "client!io",
      name = "v",
      descriptor = "I"
   )
   public static int field11323;
   @OriginalMember(
      owner = "client!io",
      name = "u",
      descriptor = "I"
   )
   public static int field11324;
   @OriginalMember(
      owner = "client!io",
      name = "w",
      descriptor = "I"
   )
   public static int field11327;
   @OriginalMember(
      owner = "client!io",
      name = "s",
      descriptor = "I"
   )
   public static int field11328;
   @OriginalMember(
      owner = "client!io",
      name = "x",
      descriptor = "I"
   )
   public static int field11331;
   @OriginalMember(
      owner = "client!io",
      name = "q",
      descriptor = "Loca;"
   )
   public static class642 field11329;

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1959(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!io",
      name = "b",
      descriptor = "([III)V"
   )
   public final void method1948(int[] param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!io",
      name = "b",
      descriptor = "()I"
   )
   public final int method1950() {
      try {
         ++field11328;
         return 0;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11332[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "()Lmv;"
   )
   public final class330 method1949() {
      boolean var1 = client.field1481;

      try {
         ++field11321;

         while(true) {
            class448 var2 = (class448)this.field11325.method290(17958);
            if (var2 == null) {
               return null;
            }

            class251 var10000 = var2.field6061;

            while(var10000 != null) {
               var10000 = var2.field6061;
               if (!var1) {
                  return var10000;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11332[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5610(int arg0) {
      try {
         field11329 = null;
         field11326 = null;
         if (arg0 != 9) {
            field11326 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11332[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "([IIIIILwm;)V"
   )
   private final void method5611(int[] arg0, int arg1, int arg2, int arg3, int arg4, class448 arg5) {
      boolean var7 = client.field1481;

      try {
         ++field11319;
         if (~(this.field11318.field10374[arg5.field6064] & 4) != arg1 && arg5.field6075 < 0) {
            int var8 = this.field11318.field10364[arg5.field6064] / class36.field514;

            while(true) {
               int var9 = (var8 + 1048575 - arg5.field6080) / var8;
               if (~arg3 > ~var9) {
                  break;
               }

               arg5.field6061.method1948(arg0, arg4, var9);
               arg3 -= var9;
               arg4 += var9;
               arg5.field6080 += var8 * var9 + -1048576;
               int var10 = class36.field514 / 100;
               int var11 = 262144 / var8;
               if (~var10 < ~var11) {
                  var10 = var11;
               }

               class251 var12;
               label74: {
                  var12 = arg5.field6061;
                  if (this.field11318.field10384[arg5.field6064] == 0) {
                     arg5.field6061 = class251.method2000(arg5.field6069, var12.method2006(), var12.method2016(), var12.method2004());
                     if (!var7) {
                        break label74;
                     }
                  }

                  arg5.field6061 = class251.method2000(arg5.field6069, var12.method2006(), 0, var12.method2004());
                  this.field11318.method5159(arg5, ~arg5.field6063.field5521[arg5.field6066] > -1, -4559);
                  arg5.field6061.method1996(var10, var12.method2016());
               }

               if (~arg5.field6063.field5521[arg5.field6066] > -1) {
                  arg5.field6061.method2008(-1);
               }

               var12.method2001(var10);
               var12.method1948(arg0, arg4, -arg4 + arg2);
               if (var12.method1997()) {
                  this.field11330.method2839(var12);
                  if (var7) {
                     return;
                  }

                  if (var7) {
                     break;
                  }
               }
            }

            arg5.field6080 += arg3 * var8;
         }

         arg5.field6061.method1948(arg0, arg4, arg3);
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field11332[6] + (arg0 != null ? field11332[2] : field11332[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field11332[2] : field11332[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "(ILwm;I)V"
   )
   private final void method5612(int arg0, class448 arg1, int arg2) {
      try {
         ++field11324;
         if ((this.field11318.field10374[arg1.field6064] & 4) != 0 && ~arg1.field6075 > -1) {
            int var4 = this.field11318.field10364[arg1.field6064] / class36.field514;
            int var5 = (1048575 - arg1.field6080 + var4) / var4;
            arg1.field6080 = arg2 * var4 + arg1.field6080 & 1048575;
            if (arg2 >= var5) {
               label38: {
                  if (this.field11318.field10384[arg1.field6064] != 0) {
                     arg1.field6061 = class251.method2000(arg1.field6069, arg1.field6061.method2006(), 0, arg1.field6061.method2004());
                     this.field11318.method5159(arg1, ~arg1.field6063.field5521[arg1.field6066] > -1, -4559);
                     if (!client.field1481) {
                        break label38;
                     }
                  }

                  arg1.field6061 = class251.method2000(arg1.field6069, arg1.field6061.method2006(), arg1.field6061.method2016(), arg1.field6061.method2004());
               }

               if (arg1.field6063.field5521[arg1.field6066] < 0) {
                  arg1.field6061.method2008(-1);
               }

               arg2 = arg1.field6080 / var4;
            }
         }

         arg1.field6061.method1959(arg2);
         int var6 = 77 % ((arg0 - -60) / 59);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field11332[5] + arg0 + ',' + (arg1 != null ? field11332[2] : field11332[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;)V"
   )
   public static final void method5613(String arg0, int arg1, String arg2) {
      try {
         ++field11320;
         if (~arg0.length() >= arg1) {
            if (class5.method44((byte)-29)) {
               class387.field5363.method4422((byte)-58);
               class550.method4167((byte)-11);
               class130.field1666 = arg2;
               class76.field1009 = arg0;
               class577.method4324((byte)-128, 5);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11332[1] + (arg0 != null ? field11332[2] : field11332[3]) + ',' + arg1 + ',' + (arg2 != null ? field11332[2] : field11332[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "(Lst;I)Lst;"
   )
   public static final class706 method5614(class706 arg0, int arg1) {
      try {
         ++field11327;
         class706 var2 = arg0 == null ? new class706() : new class706(arg0);
         var2.method5149(128, arg1, (byte)-99);
         return var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11332[11] + (arg0 != null ? field11332[2] : field11332[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "c",
      descriptor = "()Lmv;"
   )
   public final class330 method1961() {
      try {
         ++field11331;
         class448 var1 = (class448)this.field11325.method288(0);
         if (var1 == null) {
            return null;
         } else {
            return var1.field6061 != null ? var1.field6061 : this.method1949();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11332[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "<init>",
      descriptor = "(Lst;)V"
   )
   public class777(class706 arg0) {
      try {
         this.field11318 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11332[7] + (arg0 != null ? field11332[2] : field11332[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5615(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5616(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

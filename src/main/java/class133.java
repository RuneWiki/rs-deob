import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class133 {
   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2206 = new String[]{method1276(method1275("n\u0019")), method1276(method1275("c\u0007H\u0004H")), method1276(method1275("c\u0007H\u000eH")), method1276(method1275("c\u0007H\u0003H")), method1276(method1275("h\u0018\n+")), method1276(method1275("}CHi\u001d")), method1276(method1275("c\u0007H\u0002H")), method1276(method1275("c\u0007H\u000fH")), method1276(method1275("c\u0007H\u0005H")), method1276(method1275("c\u0007H\u0006H")), method1276(method1275("c\u0007H3\u000fU\u0019\u0014.\u000eaE")), method1276(method1275("c\u0007H\u0001H")), method1276(method1275("c\u0007H\u0000H"))};
   @OriginalMember(
      owner = "client!ej",
      name = "d",
      descriptor = "I"
   )
   public static int field2195 = -2;
   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2194 = null;
   @OriginalMember(
      owner = "client!ej",
      name = "g",
      descriptor = "I"
   )
   public static int field2193;
   @OriginalMember(
      owner = "client!ej",
      name = "b",
      descriptor = "I"
   )
   public static int field2196;
   @OriginalMember(
      owner = "client!ej",
      name = "f",
      descriptor = "I"
   )
   public static int field2197;
   @OriginalMember(
      owner = "client!ej",
      name = "h",
      descriptor = "I"
   )
   public static int field2198;
   @OriginalMember(
      owner = "client!ej",
      name = "e",
      descriptor = "I"
   )
   public static int field2199;
   @OriginalMember(
      owner = "client!ej",
      name = "k",
      descriptor = "I"
   )
   public static int field2200;
   @OriginalMember(
      owner = "client!ej",
      name = "c",
      descriptor = "I"
   )
   public static int field2201;
   @OriginalMember(
      owner = "client!ej",
      name = "l",
      descriptor = "I"
   )
   public static int field2202;
   @OriginalMember(
      owner = "client!ej",
      name = "j",
      descriptor = "I"
   )
   public static int field2203;
   @OriginalMember(
      owner = "client!ej",
      name = "m",
      descriptor = "I"
   )
   public static int field2204;
   @OriginalMember(
      owner = "client!ej",
      name = "i",
      descriptor = "I"
   )
   public static int field2205;

   @OriginalMember(
      owner = "client!ej",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1266(int arg0) {
      try {
         field2194 = null;
         if (arg0 != 2) {
            field2195 = -44;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2206[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method1267(int arg0, byte arg1) {
      try {
         ++field2204;
         if (arg1 >= -56) {
            field2194 = null;
         }

         return arg0 == 48 || ~arg0 == -45 || arg0 == 1003 || arg0 == 50 || arg0 == 51;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2206[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(IIIII[B[BII)V"
   )
   public static final void method1268(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, byte[] arg6, int arg7, int arg8) {
      boolean var9 = client.field4564;

      try {
         ++field2205;
         if (arg2 >= -70) {
            method1270((String)null, 42);
         }

         int var10 = -(arg8 >> 2);
         int var16 = -(arg8 & 3);
         int var11 = -arg1;
         if (var9 || var11 < 0) {
            label88:
            do {
               int var12 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg7++;
                  arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg3++]);
                  int var17 = arg7++;
                  arg5[var17] = (byte)(arg5[var17] + -arg6[arg3++]);
                  int var18 = arg7++;
                  arg5[var18] = (byte)(arg5[var18] + -arg6[arg3++]);
                  int var19 = arg7++;
                  arg5[var19] = (byte)(arg5[var19] + -arg6[arg3++]);
                  var12 = var10 + 1;
               }

               while(true) {
                  while(var12 < 0) {
                     var10001 = arg7++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg3++]);
                     var10001 = arg7++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg3++]);
                     var10001 = arg7++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg3++]);
                     var10001 = arg7++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg3++]);
                     ++var12;
                  }

                  int var13 = var16;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg7++;
                        arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg3++]);
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(~var13 > -1) {
                           var10001 = arg7++;
                           arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg3++]);
                           ++var13;
                        }

                        arg7 += arg4;
                        arg3 += arg0;
                        if (!var9) {
                           ++var11;
                           continue label88;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            } while(var11 < 0);

         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field2206[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2206[5] : field2206[4]) + ',' + (arg6 != null ? field2206[5] : field2206[4]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2196;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2206[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "b",
      descriptor = "(I)Ljava/lang/String;"
   )
   public static final String method1269(int arg0) {
      try {
         ++field2201;
         int var1 = 50 % ((arg0 - 53) / 58);
         return !class442.field6452 && class450.field6572 != null ? class450.field6572.field8486 : "";
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2206[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method1270(String arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field2199;
         if (arg0 != null) {
            if ((class128.field2146 < 200 || class628.field9157) && class128.field2146 < 200) {
               String var3 = class496.method3743(arg0, false);
               if (var3 != null) {
                  int var4 = 0;
                  if (var2 || ~class128.field2146 < ~var4) {
                     do {
                        String var5 = class496.method3743(class670.field9809[var4], false);
                        if (var5 != null && var5.equals(var3)) {
                           class126.method1228(arg0 + class100.field1637.method961(class385.field5684, true), (byte)124, 4);
                           return;
                        }

                        if (class269.field3809[var4] != null) {
                           String var6 = class496.method3743(class269.field3809[var4], false);
                           if (var6 != null && var6.equals(var3)) {
                              class126.method1228(arg0 + class100.field1637.method961(class385.field5684, true), (byte)-55, 4);
                              return;
                           }
                        }

                        ++var4;
                     } while(~class128.field2146 < ~var4);
                  }

                  int var7 = 0;
                  int var10;
                  class542 var11;
                  String var10000;
                  if (var2) {
                     var10000 = class496.method3743(class306.field4428[var7], false);
                  } else if (class791.field11564 <= var7) {
                     var10000 = class496.method3743(class304.field4398.field6665, false);
                     if (!var2) {
                        if (var10000.equals(var3)) {
                           class126.method1228(class100.field1640.method961(class385.field5684, true), (byte)-70, 4);
                           return;
                        }

                        ++class348.field4953;
                        var10 = -124 / ((arg1 - 47) / 54);
                        var11 = class549.method4093((byte)-113, class294.field4102, class126.field2108);
                        var11.field7859.method3571(255, class70.method747(arg0, -9));
                        var11.field7859.method3546((byte)-97, arg0);
                        class740.method5332(var11, (byte)77);
                        return;
                     }
                  } else {
                     var10000 = class496.method3743(class306.field4428[var7], false);
                  }

                  while(true) {
                     String var8 = var10000;
                     if (var8 != null && var8.equals(var3)) {
                        class126.method1228(class100.field1642.method961(class385.field5684, true) + arg0 + class100.field1643.method961(class385.field5684, true), (byte)-21, 4);
                        return;
                     }

                     if (class497.field7272[var7] != null) {
                        String var9 = class496.method3743(class497.field7272[var7], false);
                        if (var9 != null && var9.equals(var3)) {
                           class126.method1228(class100.field1642.method961(class385.field5684, true) + arg0 + class100.field1643.method961(class385.field5684, true), (byte)-86, 4);
                           return;
                        }
                     }

                     ++var7;
                     if (class791.field11564 <= var7) {
                        var10000 = class496.method3743(class304.field4398.field6665, false);
                        if (!var2) {
                           if (var10000.equals(var3)) {
                              class126.method1228(class100.field1640.method961(class385.field5684, true), (byte)-70, 4);
                              return;
                           }

                           ++class348.field4953;
                           var10 = -124 / ((arg1 - 47) / 54);
                           var11 = class549.method4093((byte)-113, class294.field4102, class126.field2108);
                           var11.field7859.method3571(255, class70.method747(arg0, -9));
                           var11.field7859.method3546((byte)-97, arg0);
                           class740.method5332(var11, (byte)77);
                           return;
                        }
                     } else {
                        var10000 = class496.method3743(class306.field4428[var7], false);
                     }
                  }
               }
            } else {
               class126.method1228(class100.field1610.method961(class385.field5684, true), (byte)-35, 4);
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field2206[8] + (arg0 != null ? field2206[5] : field2206[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(ILpca;)Z"
   )
   public static final boolean method1271(int arg0, class744 arg1) {
      try {
         ++field2193;
         int var2 = 127 / ((arg0 - -60) / 63);
         return arg1 == null ? false : class599.method4425(arg1.field10730, arg1.field10726, (byte)6, -arg1.field10730 + arg1.field10723, -arg1.field10726 + arg1.field10727, -arg1.field10713 + arg1.field10724, arg1.field10713);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2206[9] + arg0 + ',' + (arg1 != null ? field2206[5] : field2206[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(Lhw;Lhw;Lhw;BLhw;)V"
   )
   public static final void method1272(class141 arg0, class141 arg1, class141 arg2, byte arg3, class141 arg4) {
      try {
         class334.field4780 = arg1;
         class583.field8435 = arg4;
         class331.field4737 = arg0;
         ++field2200;
         if (arg3 != -95) {
            field2203 = -121;
         }

         class253.field3608 = new class303[class331.field4737.method1337((byte)108)][];
         class482.field7007 = new boolean[class331.field4737.method1337((byte)81)];
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2206[6] + (arg0 != null ? field2206[5] : field2206[4]) + ',' + (arg1 != null ? field2206[5] : field2206[4]) + ',' + (arg2 != null ? field2206[5] : field2206[4]) + ',' + arg3 + ',' + (arg4 != null ? field2206[5] : field2206[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(B)Ltm;"
   )
   public static final class407 method1273(byte arg0) {
      try {
         ++field2197;

         try {
            return arg0 != 11 ? null : (class407)Class.forName(field2206[0]).newInstance();
         } catch (Throwable var2) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2206[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1274(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field2198;
         client var2 = class490.field7150;
         synchronized(class490.field7150) {
            if (class589.field8507 == null) {
               Container var3;
               label95: {
                  if (class123.field1971 != null) {
                     var3 = class123.field1971;
                     if (!var1) {
                        break label95;
                     }
                  }

                  if (class514.field7493 == null) {
                     var3 = class346.field4928;
                     if (!var1) {
                        break label95;
                     }
                  }

                  var3 = class514.field7493;
               }

               class693.field10156 = var3.getSize().width;
               class620.field9009 = var3.getSize().height;
               if (class123.field1971 == var3) {
                  Insets var4 = class123.field1971.getInsets();
                  class620.field9009 -= var4.top + var4.bottom;
                  class693.field10156 -= var4.right + var4.left;
               }

               if (arg0 != -4695) {
                  method1270((String)null, 47);
               }

               label75: {
                  if (~class257.method2057(false) != -2) {
                     class384.method2987(800);
                     if (!var1) {
                        break label75;
                     }
                  }

                  class720.field10406 = class140.field2281;
                  class438.field6315 = (-class140.field2281 + class693.field10156) / 2;
                  class218.field3296 = class664.field9661;
                  class78.field1347 = 0;
               }

               if (class628.field9136 != class409.field6010) {
                  boolean var10000;
                  if (~class720.field10406 > -1025 && class218.field3296 < 768) {
                     var10000 = true;
                  } else {
                     var10000 = false;
                  }
               }

               class386.field5692.setSize(class720.field10406, class218.field3296);
               if (class444.field6473 != null) {
                  label62: {
                     if (class262.field3734) {
                        class460.method3455(class386.field5692, (byte)66);
                        if (!var1) {
                           break label62;
                        }
                     }

                     class444.field6473.method310(class386.field5692, class720.field10406, class218.field3296);
                  }
               }

               label57: {
                  if (class123.field1971 == var3) {
                     Insets var5 = class123.field1971.getInsets();
                     class386.field5692.setLocation(class438.field6315 + var5.left, class78.field1347 + var5.top);
                     if (!var1) {
                        break label57;
                     }
                  }

                  class386.field5692.setLocation(class438.field6315, class78.field1347);
               }

               if (class277.field3907 != -1) {
                  class715.method5185(true, arg0 + 4599);
               }

               class330.method2551(-70);
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field2206[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1275(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1276(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

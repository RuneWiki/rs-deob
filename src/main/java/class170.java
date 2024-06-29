import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class170 {
   @OriginalMember(
      owner = "client!hj",
      name = "e",
      descriptor = "I"
   )
   public int field2212 = -1;
   @OriginalMember(
      owner = "client!hj",
      name = "h",
      descriptor = "I"
   )
   public int field2220 = -1;
   @OriginalMember(
      owner = "client!hj",
      name = "f",
      descriptor = "[I"
   )
   public int[] field2217;
   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2222 = new String[]{method1476(method1475("\u0000;3/A")), method1476(method1475("\u001c6|")), method1476(method1475("\u0000;3*A")), method1476(method1475("\u0006$q\u0002")), method1476(method1475("\u0013\u007f3@\u0014")), method1476(method1475("\u0000;3R\u0000\u00068iPA")), method1476(method1475("\u0000;3,A")), method1476(method1475("\u0000;3-A"))};
   @OriginalMember(
      owner = "client!hj",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field2215 = new int[5];
   @OriginalMember(
      owner = "client!hj",
      name = "j",
      descriptor = "F"
   )
   public static float field2214;
   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "I"
   )
   public static int field2213;
   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "I"
   )
   public static int field2216;
   @OriginalMember(
      owner = "client!hj",
      name = "c",
      descriptor = "I"
   )
   public static int field2218;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hj",
      name = "g",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field2221;
   @OriginalMember(
      owner = "client!hj",
      name = "i",
      descriptor = "[I"
   )
   public int[] field2211;
   @OriginalMember(
      owner = "client!hj",
      name = "k",
      descriptor = "[I"
   )
   public int[] field2219;

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1470(byte arg0) {
      try {
         if (arg0 != -28) {
            field2215 = null;
         }

         field2215 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2222[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1471(int arg0) {
      try {
         class545.field7969 = new class541(class606.field8907.method4490(class782.field11389, -16777216), "", class436.field5949, 1002, -1, 0L, 0, 0, true, false, 0L, true);
         ++field2218;
         int var1 = 98 % ((41 - arg0) / 46);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2222[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   private final void method1472(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         int var10000;
         int var10001;
         label136:
         while(true) {
            int var4 = arg1.method640(255);
            if (~var4 != -1) {
               var10000 = var4;
               var10001 = 1;
               if (var3) {
                  break;
               }

               if (var4 == 1) {
                  int var5 = arg1.method640(255);
                  this.field2217 = new int[var5];
                  int var6 = 0;
                  if (var3) {
                     this.field2217[var6] = arg1.method640(255);
                     ++var6;
                  }

                  while(true) {
                     while(~this.field2217.length < ~var6) {
                        this.field2217[var6] = arg1.method640(255);
                        ++var6;
                     }

                     if (!var3) {
                        if (!var3) {
                           continue label136;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               if (var4 != 3) {
                  if (var4 != 4) {
                     if (var4 != 5) {
                        if (var4 != 6) {
                           continue;
                        }

                        this.field2219 = new int[arg1.method640(255)];
                        int var7 = 0;
                        if (var3) {
                           this.field2219[var7] = arg1.method640(255);
                           ++var7;
                        }

                        while(true) {
                           while(~var7 > ~this.field2219.length) {
                              this.field2219[var7] = arg1.method640(255);
                              ++var7;
                           }

                           if (!var3) {
                              if (!var3) {
                                 continue label136;
                              }
                              break;
                           }

                           ++var7;
                        }
                     }

                     this.field2211 = new int[arg1.method640(255)];
                     int var8 = 0;
                     if (var3) {
                        this.field2211[var8] = arg1.method640(255);
                        ++var8;
                     }

                     while(true) {
                        while(~this.field2211.length < ~var8) {
                           this.field2211[var8] = arg1.method640(255);
                           ++var8;
                        }

                        if (!var3) {
                           if (!var3) {
                              continue label136;
                           }
                           break;
                        }

                        ++var8;
                     }
                  }

                  this.field2212 = arg1.method640(255);
                  if (!var3) {
                     continue;
                  }
               }

               this.field2220 = arg1.method640(255);
               if (!var3) {
                  continue;
               }
            }

            ++field2213;
            var10000 = 58;
            var10001 = (arg0 - -40) / 53;
            break;
         }

         int var9 = var10000 / var10001;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field2222[7] + arg0 + ',' + (arg1 != null ? field2222[4] : field2222[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "<init>",
      descriptor = "(Lww;)V"
   )
   public class170(class339 arg0) {
      try {
         byte[] var2 = arg0.method2700(6, -2);
         this.method1472(107, new class66(var2));
         if (this.field2217 == null) {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2222[5] + (arg0 != null ? field2222[4] : field2222[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(IILha;IIIIII)V"
   )
   public static final void method1473(int arg0, int arg1, class479 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field1481;

      try {
         ++field2216;
         class660 var10 = (class660)class776.method5607(arg6, arg1, arg3);
         if (var10 != null) {
            label164: {
               class294 var11 = class438.field5967.method929((byte)-119, var10.method175((byte)9));
               int var12 = 3 & var10.method184(true);
               int var13 = var10.method181(-6696);
               if (~var11.field4088 == 0) {
                  int var14 = arg4;
                  if (var11.field4079 > 0) {
                     var14 = arg8;
                  }

                  if (~var13 == -1 || var13 == 2) {
                     label179: {
                        if (var12 == 0) {
                           arg2.method3640(arg0, 4, arg7, var14, true);
                           if (!var9) {
                              break label179;
                           }
                        }

                        if (~var12 == -2) {
                           arg2.method3648(arg0, (byte)32, 4, var14, arg7);
                           if (!var9) {
                              break label179;
                           }
                        }

                        if (~var12 == -3) {
                           arg2.method3640(arg0, 4, arg7 + 3, var14, true);
                           if (!var9) {
                              break label179;
                           }
                        }

                        if (var12 == 3) {
                           arg2.method3648(arg0 + 3, (byte)111, 4, var14, arg7);
                        }
                     }
                  }

                  if (~var13 == -4) {
                     label176: {
                        if (~var12 != -1) {
                           if (~var12 == -2) {
                              arg2.method3643(false, arg0, var14, arg7 + 3, 1, 1);
                              if (!var9) {
                                 break label176;
                              }
                           }

                           if (~var12 != -3) {
                              if (var12 != 3) {
                                 break label176;
                              }

                              arg2.method3643(false, arg0 - -3, var14, arg7, 1, 1);
                              if (!var9) {
                                 break label176;
                              }
                           }

                           arg2.method3643(false, arg0 + 3, var14, arg7 + 3, 1, 1);
                           if (!var9) {
                              break label176;
                           }
                        }

                        arg2.method3643(false, arg0, var14, arg7, 1, 1);
                     }
                  }

                  if (var13 != 2) {
                     break label164;
                  }

                  if (~var12 != -1) {
                     if (var12 == 1) {
                        arg2.method3640(arg0, 4, arg7 + 3, var14, true);
                        if (!var9) {
                           break label164;
                        }
                     }

                     if (~var12 == -3) {
                        arg2.method3648(arg0 - -3, (byte)-95, 4, var14, arg7);
                        if (!var9) {
                           break label164;
                        }
                     }

                     if (var12 != 3) {
                        break label164;
                     }

                     arg2.method3640(arg0, 4, arg7, var14, true);
                     if (!var9) {
                        break label164;
                     }
                  }

                  arg2.method3648(arg0, (byte)-117, 4, var14, arg7);
                  if (!var9) {
                     break label164;
                  }
               }

               class699.method5090(-85, arg2, var11, var12, arg7, arg0);
            }
         }

         class660 var15 = (class660)class338.method2672(arg6, arg1, arg3, field2221 != null ? field2221 : (field2221 = method1474(field2222[1])));
         if (var15 != null) {
            label114: {
               class294 var16 = class438.field5967.method929((byte)-85, var15.method175((byte)9));
               int var17 = var15.method184(true) & 3;
               int var18 = var15.method181(arg5 ^ -6692);
               if (~var16.field4088 != 0) {
                  class699.method5090(126, arg2, var16, var17, arg7, arg0);
                  if (!var9) {
                     break label114;
                  }
               }

               if (var18 == 9) {
                  label175: {
                     int var19 = -1118482;
                     if (var16.field4079 > 0) {
                        var19 = -1179648;
                     }

                     if (var17 != 0 && var17 != 2) {
                        arg2.method3635(arg7 + 3, arg0 - -3, arg7, false, arg0, var19);
                        if (!var9) {
                           break label175;
                        }
                     }

                     arg2.method3635(arg7 + 3, arg0, arg7, false, arg0 + 3, var19);
                  }
               }
            }
         }

         class660 var20 = (class660)class688.method5028(arg6, arg1, arg3);
         if (var20 != null) {
            class294 var21 = class438.field5967.method929((byte)-128, var20.method175((byte)9));
            int var22 = 3 & var20.method184(true);
            if (var21.field4088 != -1) {
               class699.method5090(63, arg2, var21, var22, arg7, arg0);
            }
         }

         if (arg5 != 4) {
            field2215 = null;
         }
      } catch (RuntimeException var24) {
         throw class93.method866(var24, field2222[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2222[4] : field2222[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "<init>",
      descriptor = "()V"
   )
   protected class170() {
      try {
         this.field2217 = new int[0];
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2222[5] + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1474(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1475(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1476(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class519 {
   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7561 = new String[]{method3828(method3827("v%\u0003^4")), method3828(method3827("gi\u00031a")), method3828(method3827("v%\u0003\\4")), method3828(method3827("r2As")), method3828(method3827("O/L{yngAvrw.Cx<z&Dsyx}")), method3828(method3827("<j\u0013? \u007f(A\"zz!K/,\"")), method3828(method3827("<o")), method3828(method3827("v%\u0003]4")), method3828(method3827(" $Bs!z!Ky,,y"))};
   @OriginalMember(
      owner = "client!jb",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field7559 = new class101(45, 9);
   @OriginalMember(
      owner = "client!jb",
      name = "b",
      descriptor = "I"
   )
   public static int field7557;
   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "I"
   )
   public static int field7558;
   @OriginalMember(
      owner = "client!jb",
      name = "c",
      descriptor = "I"
   )
   public static int field7560;

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(IZLct;)V",
      line = 4
   )
   public static final void method3824(int arg0, boolean arg1, class155 arg2) {
      int var3 = client.field4530;

      try {
         ++field7560;
         if (~class354.field5375 > -401) {
            class369 var4 = arg2.field1971;
            if (arg0 >= 124) {
               String var5 = arg2.field1952;
               if (var4.field5590 != null) {
                  var4 = var4.method2872(true, class597.field8793);
                  if (var4 == null) {
                     return;
                  }

                  var5 = var4.field5597;
               }

               if (var4.field5610) {
                  if (~arg2.field1959 != -1) {
                     String var6 = class489.field7224 == class180.field2219 ? class204.field2594.method1562((byte)-79, class728.field10827) : class204.field2592.method1562((byte)-115, class728.field10827);
                     var5 = var5 + class747.method5439(arg2.field1959, 20807, class693.field10418.field10333) + field7561[6] + var6 + arg2.field1959 + ")";
                  }

                  if (class367.field5530 && !arg1) {
                     class457 var7 = ~class662.field9596 == 0 ? null : class170.field2105.method3799(-125, class662.field9596);
                     if ((2 & class427.field6529) != 0 && (var7 == null || ~var4.method2870(class662.field9596, -100, var7.field6933) != ~var7.field6933)) {
                        ++class480.field7136;
                        class466.method3485(class84.field1033, 10, 0, true, class30.field330, false, class769.field11280 + field7561[5] + var5, false, true, -1, (long)arg2.field6027, (long)arg2.field6027, 0);
                     }
                  }

                  if (!arg1) {
                     String[] var8 = var4.field5559;
                     if (class110.field1348) {
                        var8 = class667.method4797(-63, var8);
                     }

                     if (var8 != null) {
                        int var9 = 4;
                        if (var3 != 0 || ~var9 <= -1) {
                           do {
                              if (var8[var9] != null) {
                                 if (var4.field5583 != 0 && var8[var9].equalsIgnoreCase(class204.field2587.method1562((byte)-71, class728.field10827))) {
                                    --var9;
                                 } else {
                                    byte var10 = 0;
                                    int var11 = class213.field2705;
                                    if (~var9 == -1) {
                                       var10 = 4;
                                    }

                                    if (~var9 == -2) {
                                       var10 = 23;
                                    }

                                    if (~var9 == -3) {
                                       var10 = 50;
                                    }

                                    if (~var9 == -4) {
                                       var10 = 52;
                                    }

                                    if (~var4.field5613 == ~var9) {
                                       var11 = var4.field5595;
                                    }

                                    if (~var9 == -5) {
                                       var10 = 16;
                                    }

                                    if (var4.field5580 == var9) {
                                       var11 = var4.field5584;
                                    }

                                    class466.method3485(var8[var9], var10, 0, true, !var8[var9].equalsIgnoreCase(class204.field2587.method1562((byte)-101, class728.field10827)) ? var11 : var4.field5588, false, field7561[8] + var5, false, true, -1, (long)arg2.field6027, (long)arg2.field6027, 0);
                                    ++class6.field104;
                                    --var9;
                                 }
                              } else {
                                 --var9;
                              }
                           } while(~var9 <= -1);
                        }
                     }

                     if (var4.field5583 == 1 && var8 != null) {
                        int var12 = 4;
                        if (var3 != 0 || var12 >= 0) {
                           do {
                              if (var8[var12] != null && var8[var12].equalsIgnoreCase(class204.field2587.method1562((byte)-92, class728.field10827))) {
                                 short var13 = 0;
                                 if (~arg2.field1959 < ~class693.field10418.field10333) {
                                    var13 = 2000;
                                 }

                                 short var14 = 0;
                                 if (~var12 == -1) {
                                    var14 = 4;
                                 }

                                 if (var12 == 1) {
                                    var14 = 23;
                                 }

                                 if (var12 == 2) {
                                    var14 = 50;
                                 }

                                 if (~var12 == -4) {
                                    var14 = 52;
                                 }

                                 if (var12 == 4) {
                                    var14 = 16;
                                 }

                                 if (var14 != 0) {
                                    var14 += var13;
                                 }

                                 class466.method3485(var8[var12], var14, 0, true, var4.field5588, false, field7561[8] + var5, false, true, -1, (long)arg2.field6027, (long)arg2.field6027, 0);
                                 ++class205.field2636;
                              }

                              --var12;
                           } while(var12 >= 0);
                        }
                     }
                  }

                  class466.method3485(class204.field2586.method1562((byte)-65, class728.field10827), 1007, 0, true, class202.field2537, false, field7561[8] + var5, arg1, true, -1, (long)arg2.field6027, (long)arg2.field6027, 0);
                  ++class423.field6420;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field7561[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7561[1] : field7561[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(B)V",
      line = 167
   )
   public static void method3825(byte arg0) {
      try {
         if (arg0 < -97) {
            field7559 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7561[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(Lck;[Liga;I)Ldja;",
      line = 178
   )
   public static final class323 method3826(class667 arg0, class481[] arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field7558;
         int var4 = 0;
         if (var3 != 0) {
            if (arg1[var4] == null || arg1[var4].field7141 <= 0L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            while(~arg1.length < ~var4) {
               if (arg1[var4] == null || arg1[var4].field7141 <= 0L) {
                  return null;
               }

               ++var4;
            }

            long var5 = OpenGL.glCreateProgramObjectARB();
            if (var3 == 0) {
               if (arg2 != 7113) {
                  method3826((class667)null, (class481[])null, -10);
               }

               int var7 = 0;
               if (var3 != 0) {
                  OpenGL.glAttachObjectARB(var5, arg1[var7].field7141);
                  ++var7;
               }

               while(true) {
                  while(~arg1.length < ~var7) {
                     OpenGL.glAttachObjectARB(var5, arg1[var7].field7141);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  OpenGL.glGetObjectParameterivARB(var5, 35714, class667.field9702, 0);
                  if (var3 == 0) {
                     if (~class667.field9702[0] == -1) {
                        if (~class667.field9702[0] == -1) {
                           System.out.println(field7561[4]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class667.field9702, 1);
                        if (~class667.field9702[1] < -2) {
                           byte[] var8 = new byte[class667.field9702[1]];
                           OpenGL.glGetInfoLogARB(var5, class667.field9702[1], class667.field9702, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (~class667.field9702[0] == -1) {
                           int var9 = 0;
                           if (var3 != 0) {
                              OpenGL.glDetachObjectARB(var5, arg1[var9].field7141);
                              ++var9;
                           }

                           while(true) {
                              while(arg1.length > var9) {
                                 OpenGL.glDetachObjectARB(var5, arg1[var9].field7141);
                                 ++var9;
                              }

                              OpenGL.glDeleteObjectARB(var5);
                              if (var3 == 0) {
                                 return null;
                              }

                              ++var9;
                           }
                        }
                     }

                     return new class323(arg0, var5, arg1);
                  }

                  ++var7;
               }
            }

            if (arg2 <= 0) {
               return null;
            }

            ++var4;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field7561[2] + (arg0 != null ? field7561[1] : field7561[3]) + ',' + (arg1 != null ? field7561[1] : field7561[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3827(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3828(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

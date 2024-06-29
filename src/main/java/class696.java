import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class696 {
   @OriginalMember(
      owner = "client!fn",
      name = "n",
      descriptor = "Z"
   )
   public boolean field10194 = false;
   @OriginalMember(
      owner = "client!fn",
      name = "k",
      descriptor = "Z"
   )
   public boolean field10195 = false;
   @OriginalMember(
      owner = "client!fn",
      name = "o",
      descriptor = "I"
   )
   public int field10197 = 2;
   @OriginalMember(
      owner = "client!fn",
      name = "l",
      descriptor = "I"
   )
   public int field10200 = 64;
   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "I"
   )
   public int field10198 = 1;
   @OriginalMember(
      owner = "client!fn",
      name = "b",
      descriptor = "I"
   )
   public int field10202 = 64;
   @OriginalMember(
      owner = "client!fn",
      name = "e",
      descriptor = "I"
   )
   public int field10204 = -1;
   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10209 = new String[]{method5074(method5073("\u0007D\u0016%")), method5074(method5073("\u000f_T\u000bS")), method5074(method5073("\u0012\u001fTg\u0006")), method5074(method5073("\u000f_T\nS")), method5074(method5073("\u000f_T\fS")), method5074(method5073("\u000f_T\u000fS")), method5074(method5073("\u000f_T\rS")), method5074(method5073("\u000f_T\bS"))};
   @OriginalMember(
      owner = "client!fn",
      name = "f",
      descriptor = "Lrca;"
   )
   public static class37 field10201 = new class37();
   @OriginalMember(
      owner = "client!fn",
      name = "m",
      descriptor = "Lsia;"
   )
   public static class407 field10205 = new class407(64);
   @OriginalMember(
      owner = "client!fn",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field10208 = new int[13];
   @OriginalMember(
      owner = "client!fn",
      name = "h",
      descriptor = "I"
   )
   public static int field10192;
   @OriginalMember(
      owner = "client!fn",
      name = "i",
      descriptor = "I"
   )
   public static int field10193;
   @OriginalMember(
      owner = "client!fn",
      name = "g",
      descriptor = "I"
   )
   public static int field10196;
   @OriginalMember(
      owner = "client!fn",
      name = "c",
      descriptor = "I"
   )
   public static int field10199;
   @OriginalMember(
      owner = "client!fn",
      name = "d",
      descriptor = "I"
   )
   public static int field10203;
   @OriginalMember(
      owner = "client!fn",
      name = "j",
      descriptor = "I"
   )
   public static int field10206;
   @OriginalMember(
      owner = "client!fn",
      name = "p",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field10207;

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(IBLww;I)Lgg;"
   )
   public static final class120 method5067(int arg0, byte arg1, class339 arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field10193;
         class66 var5 = new class66(arg2.method2697(arg0, arg3, false));
         class120 var6 = new class120(arg0, var5.method606(11856), var5.method606(arg1 + 11883), var5.method610(127), var5.method610(12), ~var5.method640(255) == -2, var5.method640(arg1 ^ -230), var5.method640(arg1 + 282));
         if (arg1 != -27) {
            field10205 = null;
         }

         int var7 = var5.method640(255);
         int var8 = 0;
         class120 var10000;
         if (var4) {
            var10000 = var6;
         } else if (~var7 >= ~var8) {
            var6.method1055((byte)88);
            var10000 = var6;
            if (!var4) {
               return var6;
            }
         } else {
            var10000 = var6;
         }

         while(true) {
            var10000.field1586.method279(false, new class483(var5.method640(255), var5.method603(-2), var5.method603(-2), var5.method603(-2), var5.method603(arg1 + 25), var5.method603(arg1 + 25), var5.method603(-2), var5.method603(-2), var5.method603(-2)));
            ++var8;
            if (~var7 >= ~var8) {
               var6.method1055((byte)88);
               var10000 = var6;
               if (!var4) {
                  return var6;
               }
            } else {
               var10000 = var6;
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field10209[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10209[2] : field10209[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5068(byte arg0) {
      try {
         field10205 = null;
         field10208 = null;
         field10207 = null;
         field10201 = null;
         if (arg0 != 66) {
            method5067(8, (byte)-45, (class339)null, -106);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10209[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(Lgea;III)V"
   )
   private final void method5069(class66 arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field1481;

      try {
         if (arg1 != -1112834463) {
            field10205 = null;
         }

         label69: {
            if (~arg3 != -2) {
               if (~arg3 == -3) {
                  this.field10200 = 1 + arg0.method603(-2);
                  this.field10202 = 1 + arg0.method603(arg1 ^ 1112834463);
                  if (!var5) {
                     break label69;
                  }
               }

               if (arg3 != 3) {
                  if (arg3 == 4) {
                     this.field10197 = arg0.method640(255);
                     if (!var5) {
                        break label69;
                     }
                  }

                  if (arg3 == 5) {
                     this.field10198 = arg0.method640(arg1 ^ -1112834402);
                     if (!var5) {
                        break label69;
                     }
                  }

                  if (~arg3 == -7) {
                     this.field10195 = true;
                     if (!var5) {
                        break label69;
                     }
                  }

                  if (~arg3 != -8) {
                     break label69;
                  }

                  this.field10194 = true;
                  if (!var5) {
                     break label69;
                  }
               }

               arg0.method628((byte)-12);
               if (!var5) {
                  break label69;
               }
            }

            this.field10204 = arg0.method603(-2);
            if (~this.field10204 == -65536) {
               this.field10204 = -1;
            }
         }

         ++field10196;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10209[5] + (arg0 != null ? field10209[2] : field10209[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(IILgea;)V"
   )
   public final void method5070(int arg0, int arg1, class66 arg2) {
      boolean var4 = client.field1481;

      try {
         if (arg1 == 12102) {
            ++field10199;

            do {
               int var5 = arg2.method640(255);
               if (var5 == 0) {
                  break;
               }

               this.method5069(arg2, -1112834463, arg0, var5);
            } while(!var4);

         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10209[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10209[2] : field10209[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(ILhr;Z)V"
   )
   public static final void method5071(int arg0, class244 arg1, boolean arg2) {
      try {
         if (class100.field1320) {
            class100.field1320 = false;
            arg0 = 0;
         }

         if (!arg2) {
            ++field10203;
            if (class66.field842 == null || !class66.field842.method1937(arg1, 0)) {
               class66.field842 = arg1;
               class785.field11471 = class163.method1353(-125);
               class216.field2742 = arg0;
               class113.field1508 = arg0;
               if (class113.field1508 == 0) {
                  class409.method3212(-29164);
                  return;
               }

               class170.field2214 = class380.field5296;
               class615.field9064 = class439.field5974;
               class726.field10604 = class382.field5307;
               class479.field6666 = class773.field11262;
               class428.field5817 = class115.field1523;
               class42.field554 = class259.field3292;
               class20.field318 = class58.field762;
               class30.field435 = class457.field6296;
               class35.field490 = class232.field2886;
               class650.field9712 = class172.field2230;
            }

         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10209[3] + arg0 + ',' + (arg1 != null ? field10209[2] : field10209[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(IIBIIII)V"
   )
   public static final void method5072(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         class511.method3859(arg6, 124);
         ++field10192;
         int var8 = 0;
         int var9 = -arg5 + arg6;
         if (var9 < 0) {
            var9 = 0;
         }

         int var10 = arg6;
         int var11 = -arg6;
         int var12 = var9;
         int var13 = -var9;
         int var14 = -1;
         int var15 = -1;
         int[] var16 = class237.field3001[arg4];
         int var17 = -var9 + arg3;
         class385.method3045(arg1, var17, var16, -arg6 + arg3, (byte)-72);
         int var18 = arg3 - -var9;
         class385.method3045(arg0, var18, var16, var17, (byte)-128);
         class385.method3045(arg1, arg3 + arg6, var16, var18, (byte)-113);
         int var10000;
         byte var10001;
         if (var7) {
            var14 += 2;
            var15 += 2;
            var11 += var14;
            var13 += var15;
            if (~var13 <= -1 && var9 >= 1) {
               class89.field1205[var9] = var8;
               var12 = var9 - 1;
               var13 -= var12 << 1;
            }
         } else {
            if (var8 >= arg6) {
               var10000 = arg2;
               var10001 = 87;
               if (!var7) {
                  if (arg2 != 87) {
                     method5068((byte)5);
                     return;
                  }

                  return;
               }
            } else {
               var14 += 2;
               var15 += 2;
               var11 += var14;
               var13 += var15;
               var10000 = ~var13;
               var10001 = -1;
            }

            if (var10000 <= var10001 && var9 >= 1) {
               class89.field1205[var9] = var8;
               var12 = var9 - 1;
               var13 -= var12 << 1;
            }
         }

         while(true) {
            ++var8;
            if (var11 >= 0) {
               --var10;
               var11 -= var10 << 1;
               int[] var26;
               int[] var27;
               int var28;
               int var29;
               if (~var10 > ~var9) {
                  int[] var19 = class237.field3001[arg4 + var10];
                  int[] var20 = class237.field3001[-var10 + arg4];
                  int var21 = class89.field1205[var10];
                  int var22 = arg3 + var8;
                  int var23 = -var8 + arg3;
                  int var24 = arg3 + var21;
                  int var25 = -var21 + arg3;
                  class385.method3045(arg1, var25, var19, var23, (byte)-74);
                  class385.method3045(arg0, var24, var19, var25, (byte)-109);
                  class385.method3045(arg1, var22, var19, var24, (byte)-90);
                  class385.method3045(arg1, var25, var20, var23, (byte)-77);
                  class385.method3045(arg0, var24, var20, var25, (byte)-89);
                  class385.method3045(arg1, var22, var20, var24, (byte)-120);
                  if (var7) {
                     var26 = class237.field3001[arg4 + var10];
                     var27 = class237.field3001[-var10 + arg4];
                     var28 = arg3 + var8;
                     var29 = -var8 + arg3;
                     class385.method3045(arg1, var28, var26, var29, (byte)-75);
                     class385.method3045(arg1, var28, var27, var29, (byte)-124);
                  }
               } else {
                  var26 = class237.field3001[arg4 + var10];
                  var27 = class237.field3001[-var10 + arg4];
                  var28 = arg3 + var8;
                  var29 = -var8 + arg3;
                  class385.method3045(arg1, var28, var26, var29, (byte)-75);
                  class385.method3045(arg1, var28, var27, var29, (byte)-124);
               }
            }

            int[] var30 = class237.field3001[arg4 - -var8];
            int[] var31 = class237.field3001[-var8 + arg4];
            int var32 = arg3 + var10;
            int var33 = -var10 + arg3;
            int var34;
            int var35;
            int var36;
            if (~var8 <= ~var9) {
               class385.method3045(arg1, var32, var30, var33, (byte)-114);
               class385.method3045(arg1, var32, var31, var33, (byte)-110);
               if (var7) {
                  var34 = var8 > var12 ? class89.field1205[var8] : var12;
                  var35 = arg3 + var34;
                  var36 = arg3 - var34;
                  class385.method3045(arg1, var36, var30, var33, (byte)-82);
                  class385.method3045(arg0, var35, var30, var36, (byte)-64);
                  class385.method3045(arg1, var32, var30, var35, (byte)-74);
                  class385.method3045(arg1, var36, var31, var33, (byte)-106);
                  class385.method3045(arg0, var35, var31, var36, (byte)-128);
                  class385.method3045(arg1, var32, var31, var35, (byte)-83);
               }
            } else {
               var34 = var8 > var12 ? class89.field1205[var8] : var12;
               var35 = arg3 + var34;
               var36 = arg3 - var34;
               class385.method3045(arg1, var36, var30, var33, (byte)-82);
               class385.method3045(arg0, var35, var30, var36, (byte)-64);
               class385.method3045(arg1, var32, var30, var35, (byte)-74);
               class385.method3045(arg1, var36, var31, var33, (byte)-106);
               class385.method3045(arg0, var35, var31, var36, (byte)-128);
               class385.method3045(arg1, var32, var31, var35, (byte)-83);
            }

            if (var8 >= var10) {
               var10000 = arg2;
               var10001 = 87;
               if (!var7) {
                  if (arg2 != 87) {
                     method5068((byte)5);
                     return;
                  }

                  return;
               }
            } else {
               var14 += 2;
               var15 += 2;
               var11 += var14;
               var13 += var15;
               var10000 = ~var13;
               var10001 = -1;
            }

            if (var10000 <= var10001 && var12 >= 1) {
               class89.field1205[var12] = var8;
               --var12;
               var13 -= var12 << 1;
            }
         }
      } catch (RuntimeException var38) {
         throw class93.method866(var38, field10209[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5073(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5074(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

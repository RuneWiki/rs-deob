import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class676 {
   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10000 = new String[]{method4949(method4948("N$$y")), method4949(method4948("[\u007ff;\u001b")), method4949(method4948("F9fSN")), method4949(method4948("F9fTN")), method4949(method4948("F9fQN")), method4949(method4948("F9fPN")), method4949(method4948("F9fWN"))};
   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "I"
   )
   public static int field9995;
   @OriginalMember(
      owner = "client!fh",
      name = "d",
      descriptor = "I"
   )
   public static int field9997;
   @OriginalMember(
      owner = "client!fh",
      name = "e",
      descriptor = "I"
   )
   public static int field9998;
   @OriginalMember(
      owner = "client!fh",
      name = "c",
      descriptor = "I"
   )
   public static int field9999;
   @OriginalMember(
      owner = "client!fh",
      name = "b",
      descriptor = "Lnj;"
   )
   public static class468 field9996;

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4942(int arg0) {
      try {
         class407 var1 = class563.field8278;
         synchronized(class563.field8278) {
            class563.field8278.method3187(arg0 + -786);
         }

         ++field9999;
         class407 var2 = class88.field1196;
         synchronized(class88.field1196) {
            class88.field1196.method3187(-23825);
         }

         if (arg0 != -23039) {
            method4947(75, (class66)null);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10000[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4943(int arg0) {
      try {
         if (arg0 != 0) {
            method4942(-37);
         }

         field9996 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10000[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(Lhg;IZ)Z"
   )
   public static final boolean method4944(class529 arg0, int arg1, boolean arg2) {
      try {
         ++field9998;
         class596.field8821.method872(arg0.field7410[arg1], arg0.field7418[arg1], arg0.field7406[arg1], class84.field1167);
         if (!arg2) {
            return true;
         } else {
            int var3 = class84.field1167[2];
            if (~var3 > -51) {
               return false;
            } else {
               arg0.field7423[arg1] = (short)(class84.field1167[0] * class791.field11571 / var3 + class649.field9695);
               arg0.field7419[arg1] = (short)(class84.field1167[1] * class221.field2772 / var3 + class554.field8139);
               arg0.field7421[arg1] = (short)var3;
               return true;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10000[3] + (arg0 != null ? field10000[1] : field10000[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I"
   )
   public static final int method4945(String arg0, String arg1, int arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field9995;
         int var5 = arg1.length();
         int var6 = arg0.length();
         int var7 = 0;
         int var8 = 0;
         char var9 = 0;
         char var10 = 0;

         int var10000;
         label161:
         while(~(-var9 + var7) > ~var5 || ~(var8 - var10) > ~var6) {
            var10000 = var7 - var9;
            int var10001 = var5;

            char var15;
            char var16;
            do {
               if (var10000 >= var10001) {
                  return -1;
               }

               if (var8 - var10 >= var6) {
                  return 1;
               }

               char var11;
               label151: {
                  if (var9 == 0) {
                     var11 = arg1.charAt(var7++);
                     if (!var4) {
                        break label151;
                     }
                  }

                  var11 = var9;
                  boolean var12 = false;
               }

               char var13;
               label156: {
                  if (var10 != 0) {
                     var13 = var10;
                     boolean var14 = false;
                     if (!var4) {
                        break label156;
                     }
                  }

                  var13 = arg0.charAt(var8++);
               }

               var9 = class136.method1137(0, var11);
               var10 = class136.method1137(0, var13);
               var15 = class738.method5362(25, var11, arg2);
               var16 = class738.method5362(107, var13, arg2);
               if (var15 == var16) {
                  continue label161;
               }

               var10000 = ~Character.toUpperCase(var15);
               var10001 = ~Character.toUpperCase(var16);
            } while(var4);

            if (var10000 != var10001) {
               char var17 = Character.toLowerCase(var15);
               char var18 = Character.toLowerCase(var16);
               if (var17 != var18) {
                  return class753.method5458(var17, arg2, 69) - class753.method5458(var18, arg2, arg3 + -12371);
               }
            }
         }

         if (arg3 != 12455) {
            return 95;
         } else {
            int var19 = Math.min(var5, var6);
            int var20 = 0;
            int var21;
            int var22;
            char var23;
            char var24;
            char var25;
            char var26;
            if (var4) {
               if (~arg2 == -3) {
                  var21 = var5 + -1 + -var20;
                  var22 = -1 - var20 + var6;
                  if (var4) {
                     var22 = var20;
                     var21 = var20;
                  }
               } else {
                  var22 = var20;
                  var21 = var20;
               }

               var23 = arg1.charAt(var21);
               var24 = arg0.charAt(var22);
               if (var23 != var24 && Character.toUpperCase(var23) != Character.toUpperCase(var24)) {
                  var25 = Character.toLowerCase(var23);
                  var26 = Character.toLowerCase(var24);
                  if (~var25 != ~var26) {
                     return class753.method5458(var25, arg2, -99) - class753.method5458(var26, arg2, 102);
                  }
               }

               ++var20;
            }

            while(true) {
               byte var34;
               if (~var19 >= ~var20) {
                  int var27 = -var6 + var5;
                  var10000 = ~var27;
                  var34 = -1;
                  if (!var4) {
                     if (var10000 != -1) {
                        return var27;
                     }

                     int var28 = 0;
                     char var33;
                     if (var4) {
                        var33 = arg1.charAt(var28);
                     } else if (var28 >= var19) {
                        var33 = 0;
                        if (!var4) {
                           return 0;
                        }
                     } else {
                        var33 = arg1.charAt(var28);
                     }

                     while(true) {
                        char var29 = var33;
                        char var30 = arg0.charAt(var28);
                        if (~var29 != ~var30) {
                           return class753.method5458(var29, arg2, 123) - class753.method5458(var30, arg2, arg3 + -12419);
                        }

                        ++var28;
                        if (var28 >= var19) {
                           var33 = 0;
                           if (!var4) {
                              return 0;
                           }
                        } else {
                           var33 = arg1.charAt(var28);
                        }
                     }
                  }
               } else {
                  var10000 = ~arg2;
                  var34 = -3;
               }

               if (var10000 == var34) {
                  var21 = var5 + -1 + -var20;
                  var22 = -1 - var20 + var6;
                  if (var4) {
                     var22 = var20;
                     var21 = var20;
                  }
               } else {
                  var22 = var20;
                  var21 = var20;
               }

               var23 = arg1.charAt(var21);
               var24 = arg0.charAt(var22);
               if (var23 != var24 && Character.toUpperCase(var23) != Character.toUpperCase(var24)) {
                  var25 = Character.toLowerCase(var23);
                  var26 = Character.toLowerCase(var24);
                  if (~var25 != ~var26) {
                     return class753.method5458(var25, arg2, -99) - class753.method5458(var26, arg2, 102);
                  }
               }

               ++var20;
            }
         }
      } catch (RuntimeException var32) {
         throw class93.method866(var32, field10000[2] + (arg0 != null ? field10000[1] : field10000[0]) + ',' + (arg1 != null ? field10000[1] : field10000[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(Lnl;)V"
   )
   public static final void method4946(class713 arg0) {
      if (arg0 != null) {
         for(int var1 = 0; var1 < 2; ++var1) {
            class713 var2 = null;

            for(class713 var3 = class127.field1637[var1]; var3 != null; var3 = var3.field10469) {
               if (arg0 == var3) {
                  if (var2 != null) {
                     var2.field10469 = var3.field10469;
                  } else {
                     class127.field1637[var1] = var3.field10469;
                  }

                  class323.field4420 = true;
                  return;
               }

               var2 = var3;
            }

            class713 var4 = null;

            for(class713 var5 = class217.field2753[var1]; var5 != null; var5 = var5.field10469) {
               if (arg0 == var5) {
                  if (var4 != null) {
                     var4.field10469 = var5.field10469;
                  } else {
                     class217.field2753[var1] = var5.field10469;
                  }

                  class323.field4420 = true;
                  return;
               }

               var4 = var5;
            }

            class713 var6 = null;

            for(class713 var7 = class500.field6970[var1]; var7 != null; var7 = var7.field10469) {
               if (arg0 == var7) {
                  if (var6 != null) {
                     var6.field10469 = var7.field10469;
                  } else {
                     class500.field6970[var1] = var7.field10469;
                  }

                  class323.field4420 = true;
                  return;
               }

               var6 = var7;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(ILgea;)Liga;"
   )
   public static final class91 method4947(int arg0, class66 arg1) {
      try {
         if (arg0 != 24595) {
            return null;
         } else {
            ++field9997;
            String var2 = arg1.method606(11856);
            class237 var3 = class405.method3174(true)[arg1.method640(arg0 ^ 24812)];
            class596 var4 = class680.method4958(123)[arg1.method640(255)];
            int var5 = arg1.method652((byte)-110);
            int var6 = arg1.method652((byte)48);
            int var7 = arg1.method640(255);
            int var8 = arg1.method640(255);
            int var9 = arg1.method640(255);
            int var10 = arg1.method603(-2);
            int var11 = arg1.method603(-2);
            int var12 = arg1.method610(arg0 ^ 24685);
            int var13 = arg1.method610(arg0 ^ -24652);
            int var14 = arg1.method610(arg0 + -24597);
            return new class91(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field10000[4] + arg0 + ',' + (arg1 != null ? field10000[1] : field10000[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4948(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4949(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class408 extends class454 {
   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5639 = new String[]{method3211(method3210("-JXv+")), method3211(method3210("-JXz+")), method3211(method3210("-JXp+")), method3211(method3210("-JXx+")), method3211(method3210("-JX{+")), method3211(method3210("-JXy+")), method3211(method3210("-JX}+")), method3211(method3210("=\rX\u0010~")), method3211(method3210("(V\u001aR")), method3211(method3210("-JX\u007f+")), method3211(method3210("-JX|+"))};
   @OriginalMember(
      owner = "client!ki",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field5633 = new int[8];
   @OriginalMember(
      owner = "client!ki",
      name = "p",
      descriptor = "I"
   )
   public static int field5627;
   @OriginalMember(
      owner = "client!ki",
      name = "m",
      descriptor = "I"
   )
   public static int field5628;
   @OriginalMember(
      owner = "client!ki",
      name = "r",
      descriptor = "I"
   )
   public static int field5629;
   @OriginalMember(
      owner = "client!ki",
      name = "n",
      descriptor = "I"
   )
   public static int field5630;
   @OriginalMember(
      owner = "client!ki",
      name = "o",
      descriptor = "I"
   )
   public static int field5631;
   @OriginalMember(
      owner = "client!ki",
      name = "q",
      descriptor = "I"
   )
   public static int field5632;
   @OriginalMember(
      owner = "client!ki",
      name = "l",
      descriptor = "I"
   )
   public static int field5634;
   @OriginalMember(
      owner = "client!ki",
      name = "s",
      descriptor = "I"
   )
   public static int field5635;
   @OriginalMember(
      owner = "client!ki",
      name = "j",
      descriptor = "I"
   )
   public static int field5636;
   @OriginalMember(
      owner = "client!ki",
      name = "k",
      descriptor = "I"
   )
   public static int field5637;
   @OriginalMember(
      owner = "client!ki",
      name = "t",
      descriptor = "I"
   )
   public static int field5638;

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            field5633 = null;
         }

         ++field5629;
         return super.field6259.method5434((byte)-127) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5639[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(Ljava/lang/String;IZ)V"
   )
   public static final void method3205(String param0, int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field5638;
         if (arg0 >= -46) {
            this.method24(-57, true);
         }

         super.field6263 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5639[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (arg0) {
            if (super.field6259.method5434((byte)-115)) {
               super.field6263 = 2;
            }

            ++field5634;
            if (super.field6263 < 0 || super.field6263 > 2) {
               super.field6263 = this.method23(1);
            }

         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5639[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3206(int arg0) {
      try {
         if (arg0 != -32212) {
            field5630 = -99;
         }

         field5633 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5639[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method3207(boolean arg0) {
      try {
         if (arg0) {
            field5630 = -81;
         }

         ++field5635;
         return !super.field6259.method5434((byte)-123);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5639[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(ZC)Z"
   )
   public static final boolean method3208(boolean arg0, char arg1) {
      boolean var2 = client.field1481;

      try {
         ++field5628;
         if (Character.isISOControl(arg1)) {
            return false;
         } else if (class471.method3573(48, arg1)) {
            return true;
         } else {
            char[] var3 = class135.field1720;
            if (arg0) {
               method3205((String)null, -49, false);
            }

            int var4 = 0;
            char var5;
            if (var2) {
               var5 = var3[var4];
               if (~arg1 == ~var5) {
                  return true;
               }

               ++var4;
            }

            while(true) {
               char var10000;
               if (var4 >= var3.length) {
                  char[] var6 = class746.field10915;
                  var10000 = 0;
                  if (!var2) {
                     int var7 = 0;
                     char var8;
                     if (var2) {
                        var8 = var6[var7];
                        if (arg1 == var8) {
                           return true;
                        }

                        ++var7;
                     }

                     while(true) {
                        if (var6.length <= var7) {
                           var10000 = 0;
                           if (!var2) {
                              return false;
                           }
                        } else {
                           var10000 = var6[var7];
                        }

                        var8 = var10000;
                        if (arg1 == var8) {
                           return true;
                        }

                        ++var7;
                     }
                  }
               } else {
                  var10000 = var3[var4];
               }

               var5 = var10000;
               if (~arg1 == ~var5) {
                  return true;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field5639[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class408(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field5627;
         if (arg0 != 1) {
            this.method20((byte)-123, -113);
         }

         if (super.field6259.method5434((byte)-121)) {
            return 2;
         } else {
            return super.field6259.field11012.method22((byte)115) && class22.method169(4096, super.field6259.field11012.method27(arg0 ^ -18034)) ? 1 : 0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5639[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class408(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ki",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3209(int arg0) {
      try {
         ++field5637;
         if (arg0 != -18033) {
            field5631 = -18;
         }

         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5639[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3210(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3211(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

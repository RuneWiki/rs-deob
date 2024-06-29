import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class211 extends class96 {
   @OriginalMember(
      owner = "client!jq",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public String field3012;
   @OriginalMember(
      owner = "client!jq",
      name = "y",
      descriptor = "Lom;"
   )
   public class722 field3011;
   @OriginalMember(
      owner = "client!jq",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3024 = new String[]{method1828(method1827("@93p\u0007D!irF")), method1828(method1827("D=q ")), method1828(method1827("Qf3b\u0013")), method1828(method1827("@93\nF")), method1828(method1827("@93\rF")), method1828(method1827("@93\u000eF")), method1828(method1827("@93\tF")), method1828(method1827("@93\bF")), method1828(method1827("@93\u000fF"))};
   @OriginalMember(
      owner = "client!jq",
      name = "x",
      descriptor = "Liw;"
   )
   public static class107 field3013 = new class107(5);
   @OriginalMember(
      owner = "client!jq",
      name = "q",
      descriptor = "Lcv;"
   )
   public static class249 field3018 = new class249(method1828(method1827("x\u000b")), 1);
   @OriginalMember(
      owner = "client!jq",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field3020 = false;
   @OriginalMember(
      owner = "client!jq",
      name = "H",
      descriptor = "Lhf;"
   )
   public static class198 field3021 = new class198("", 15);
   @OriginalMember(
      owner = "client!jq",
      name = "t",
      descriptor = "F"
   )
   public static float field3017;
   @OriginalMember(
      owner = "client!jq",
      name = "F",
      descriptor = "F"
   )
   public static float field3023;
   @OriginalMember(
      owner = "client!jq",
      name = "s",
      descriptor = "I"
   )
   public static int field3007;
   @OriginalMember(
      owner = "client!jq",
      name = "E",
      descriptor = "I"
   )
   public int field3008;
   @OriginalMember(
      owner = "client!jq",
      name = "A",
      descriptor = "I"
   )
   public static int field3009;
   @OriginalMember(
      owner = "client!jq",
      name = "u",
      descriptor = "I"
   )
   public static int field3010;
   @OriginalMember(
      owner = "client!jq",
      name = "G",
      descriptor = "I"
   )
   public static int field3014;
   @OriginalMember(
      owner = "client!jq",
      name = "B",
      descriptor = "I"
   )
   public static int field3015;
   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "Lsa;"
   )
   public static class39 field3022;
   @OriginalMember(
      owner = "client!jq",
      name = "v",
      descriptor = "[[I"
   )
   public static int[][] field3019;
   @OriginalMember(
      owner = "client!jq",
      name = "C",
      descriptor = "[[[Lhs;"
   )
   public static class312[][][] field3016;

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(Ltea;Z)Z"
   )
   public final boolean method1821(class272 arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         ++field3014;
         boolean var4 = arg1;
         arg0.method962(!arg1);
         class272 var5 = (class272)this.field3011.method5225(true);
         boolean var10000;
         if (var3) {
            var10000 = class458.method3545(2259, arg0.field4159, var5.field4159);
         } else if (var5 == null) {
            this.field3011.method5224(arg0, 54);
            ++this.field3008;
            var10000 = arg1;
            if (!var3) {
               return arg1;
            }
         } else {
            var10000 = class458.method3545(2259, arg0.field4159, var5.field4159);
         }

         while(!var10000) {
            var5 = (class272)this.field3011.method5227(-17856);
            var4 = false;
            if (var5 == null) {
               this.field3011.method5224(arg0, 54);
               ++this.field3008;
               var10000 = var4;
               if (!var3) {
                  return var4;
               }
            } else {
               var10000 = class458.method3545(2259, arg0.field4159, var5.field4159);
            }
         }

         class75.method830(var5, !arg1, arg0);
         ++this.field3008;
         if (var4) {
            return false;
         } else {
            return true;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3024[8] + (arg0 != null ? field3024[2] : field3024[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1822(int arg0, int arg1) {
      try {
         ++field3010;
         if (~class394.field5712 == -8) {
            if (class528.field7463 == 0 && ~class467.field6773 == -1) {
               class585.field8203 = arg1;
               class755.method5457(arg0, false);
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3024[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(Ltea;I)Z"
   )
   public final boolean method1823(class272 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            method1826(67);
         }

         ++field3015;
         int var3 = this.method1824(75);
         arg0.method962(false);
         --this.field3008;
         if (~this.field3008 == -1) {
            this.method2140((byte)-127);
            this.method962(false);
            --class444.field6480;
            class144.field2280.method1050(-127, this, arg0.field4155);
            return false;
         } else {
            return this.method1824(127) != var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3024[3] + (arg0 != null ? field3024[2] : field3024[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method1824(int arg0) {
      try {
         ++field3009;
         if (arg0 < 45) {
            method1822(-28, -79);
         }

         return this.field3011.field10341.field1553 != this.field3011.field10341 ? ((class272)this.field3011.field10341.field1553).field4159 : -1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3024[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method1825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field10022;

      try {
         ++field3007;
         int var8 = class437.method3398(class587.field8239, (byte)-114, arg4, class767.field11011);
         int var9 = class437.method3398(class587.field8239, (byte)-49, arg2, class767.field11011);
         int var10 = class437.method3398(class729.field10384, (byte)111, arg3, class604.field8618);
         int var11 = class437.method3398(class729.field10384, (byte)-18, arg0, class604.field8618);
         int var12 = class437.method3398(class587.field8239, (byte)-3, arg4 + arg5, class767.field11011);
         int var13 = class437.method3398(class587.field8239, (byte)-46, -arg5 + arg2, class767.field11011);
         int var14 = var8;
         if (var7) {
            class100.method989(var10, (byte)22, var11, arg1, class788.field11482[var8]);
            var14 = var8 + 1;
         }

         while(true) {
            while(var14 < var12) {
               class100.method989(var10, (byte)22, var11, arg1, class788.field11482[var14]);
               ++var14;
            }

            int var15 = var9;
            if (!var7) {
               if (var7) {
                  class100.method989(var10, (byte)22, var11, arg1, class788.field11482[var9]);
                  var15 = var9 - 1;
               }

               while(true) {
                  int var10000;
                  short var10001;
                  if (~var15 >= ~var13) {
                     int var16 = class437.method3398(class729.field10384, (byte)-53, arg3 + arg5, class604.field8618);
                     int var17 = class437.method3398(class729.field10384, (byte)-54, -arg5 + arg0, class604.field8618);
                     int var18 = var12;
                     var10000 = arg6;
                     var10001 = -22516;
                     if (!var7) {
                        if (arg6 != -22516) {
                           method1826(-41);
                           if (!var7 && var12 > var13) {
                              return;
                           }
                        } else if (var12 > var13) {
                           return;
                        }

                        do {
                           int[] var19 = class788.field11482[var18];
                           class100.method989(var10, (byte)22, var16, arg1, var19);
                           class100.method989(var17, (byte)22, var11, arg1, var19);
                           ++var18;
                        } while(var18 <= var13);

                        return;
                     }
                  } else {
                     var10000 = var10;
                     var10001 = 22;
                  }

                  class100.method989(var10000, (byte)var10001, var11, arg1, class788.field11482[var15]);
                  --var15;
               }
            }

            ++var14;
         }
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field3024[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class211(String arg0) {
      try {
         this.field3012 = arg0;
         this.field3011 = new class722();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3024[0] + (arg0 != null ? field3024[2] : field3024[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1826(int arg0) {
      try {
         field3016 = null;
         field3021 = null;
         if (arg0 != -17295) {
            method1826(-66);
         }

         field3013 = null;
         field3022 = null;
         field3018 = null;
         field3019 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3024[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1827(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1828(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class595 extends class557 {
   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8391 = new String[]{method4370(method4369("S!)bB\u001a")), method4370(method4369("S!)bJ\u001a")), method4370(method4369("S!)bL\u001a")), method4370(method4369("S!)bK\u001a")), method4370(method4369("S!)bN\u001a")), method4370(method4369("S!)bO\u001a")), method4370(method4369("S!)bI\u001a")), method4370(method4369("E\"&"))};
   @OriginalMember(
      owner = "client!aja",
      name = "h",
      descriptor = "I"
   )
   public static int field8386 = 503;
   @OriginalMember(
      owner = "client!aja",
      name = "p",
      descriptor = "[[I"
   )
   public static int[][] field8388 = new int[][]{{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!aja",
      name = "n",
      descriptor = "Lfm;"
   )
   public static class164 field8385 = new class164(10, 5);
   @OriginalMember(
      owner = "client!aja",
      name = "m",
      descriptor = "I"
   )
   public static int field8380;
   @OriginalMember(
      owner = "client!aja",
      name = "l",
      descriptor = "I"
   )
   public static int field8381;
   @OriginalMember(
      owner = "client!aja",
      name = "q",
      descriptor = "I"
   )
   public static int field8382;
   @OriginalMember(
      owner = "client!aja",
      name = "j",
      descriptor = "I"
   )
   public static int field8384;
   @OriginalMember(
      owner = "client!aja",
      name = "i",
      descriptor = "I"
   )
   public static int field8387;
   @OriginalMember(
      owner = "client!aja",
      name = "o",
      descriptor = "I"
   )
   public static int field8389;
   @OriginalMember(
      owner = "client!aja",
      name = "r",
      descriptor = "I"
   )
   public static int field8390;
   @OriginalMember(
      owner = "client!aja",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field8383;

   @OriginalMember(
      owner = "client!aja",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class595(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!aja",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4366(byte arg0) {
      try {
         field8385 = null;
         if (arg0 <= -82) {
            field8383 = null;
            field8388 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8391[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field8381;
         if (!arg1) {
            field8386 = -46;
         }

         super.field7905 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8391[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4367(int arg0) {
      try {
         if (arg0 > -52) {
            field8388 = null;
         }

         ++field8387;
         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8391[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "d",
      descriptor = "(I)I"
   )
   public static final int method4368(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field8382;
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         if (class720.field10318.field1275 && !class720.field10318.field1291) {
            label132: {
               var2 = true;
               if (class223.field3173.field6015 < 512 && class223.field3173.field6015 != 0) {
                  var2 = false;
               }

               if (class82.field1290.startsWith(field8391[7])) {
                  var3 = true;
                  var4 = true;
                  if (!var1) {
                     break label132;
                  }
               }

               var3 = true;
            }
         }

         if (class686.field9904) {
            var4 = false;
         }

         if (class13.field194) {
            var2 = false;
         }

         if (class44.field654) {
            var3 = false;
         }

         if (!var2 && !var3 && !var4) {
            return class312.method2544(1);
         } else {
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (var2) {
               try {
                  var5 = class635.method4642(20, 2, 1000);
               } catch (Exception var16) {
               }
            }

            if (var4) {
               try {
                  var7 = class635.method4642(arg0 + -26773, 3, 1000);
                  if (class476.field6870.field9109.method4676(-91) == 3) {
                     label133: {
                        long var9;
                        label134: {
                           class56 var8 = class54.field794.method157();
                           var9 = var8.field808 & 281474976710655L;
                           int var11 = var8.field804;
                           if (var11 != 4318) {
                              if (var11 != 4098) {
                                 break label133;
                              }

                              if (!var1) {
                                 break label134;
                              }
                           }

                           var3 &= var9 >= 64425238954L;
                           if (!var1) {
                              break label133;
                           }
                        }

                        var3 &= var9 >= 60129613779L;
                     }
                  }
               } catch (Exception var17) {
               }
            }

            if (var3) {
               try {
                  var6 = class635.method4642(20, 1, 1000);
               } catch (Exception var15) {
               }
            }

            if (~var5 == 0 && var6 == -1 && var7 == -1) {
               return class312.method2544(1);
            } else {
               if (arg0 != 26793) {
                  field8383 = null;
               }

               int var12 = (int)((float)var6 * 1.1F);
               int var13 = (int)((float)var7 * 1.1F);
               if (var13 < var5 && var12 < var5) {
                  return class143.method1423(var5, 12000);
               } else {
                  return var13 > var12 ? class783.method5654(var13, 3, 20285) : class783.method5654(var12, 1, 20285);
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field8391[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class595(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            method4368(-82);
         }

         ++field8384;
         return 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8391[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            field8388 = null;
         }

         ++field8380;
         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8391[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field8389;
         if (arg0 != -22) {
            this.method97(65);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8391[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4369(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4370(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

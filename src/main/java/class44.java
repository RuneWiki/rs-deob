import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class44 {
   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "I"
   )
   public int field989;
   @OriginalMember(
      owner = "client!vba",
      name = "g",
      descriptor = "I"
   )
   public int field990;
   @OriginalMember(
      owner = "client!vba",
      name = "e",
      descriptor = "I"
   )
   public int field984;
   @OriginalMember(
      owner = "client!vba",
      name = "i",
      descriptor = "I"
   )
   public int field991;
   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field994 = new String[]{method562(method561("8\u001av\u0018sf")), method562(method561("8\u001av\u0018uf")), method562(method561("5V9\u0018J")), method562(method561(" \r{Z")), method562(method561("8\u001av\u0018vf")), method562(method561("8\u001av\u0018rf")), method562(method561("8\u001av\u0018qf")), method562(method561("8\u001av\u0018\u000b'\u0016~B\tf")), method562(method561("8\u001av\u0018tf"))};
   @OriginalMember(
      owner = "client!vba",
      name = "b",
      descriptor = "Lgh;"
   )
   public static class572 field986 = new class572(81, 6);
   @OriginalMember(
      owner = "client!vba",
      name = "j",
      descriptor = "I"
   )
   public static int field985;
   @OriginalMember(
      owner = "client!vba",
      name = "c",
      descriptor = "I"
   )
   public static int field987;
   @OriginalMember(
      owner = "client!vba",
      name = "d",
      descriptor = "I"
   )
   public static int field988;
   @OriginalMember(
      owner = "client!vba",
      name = "h",
      descriptor = "I"
   )
   public static int field992;
   @OriginalMember(
      owner = "client!vba",
      name = "f",
      descriptor = "I"
   )
   public static int field993;

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public static final void method555(class65 arg0, byte arg1) {
      boolean var2 = client.field4564;

      try {
         ++field988;
         int var3 = 0;
         int var4 = 0;
         if (class262.field3734) {
            var3 = class124.method1174((byte)125);
            var4 = class745.method5410(85);
         }

         int var5;
         int var6;
         int var7;
         int var9;
         byte var10;
         int var11;
         int var12;
         int var10000;
         int var10001;
         label228: {
            var5 = class582.field8424 - -var3;
            var6 = class583.field8437 - -var4;
            var7 = class733.field10544;
            int var8 = 42 / ((arg1 - 64) / 48);
            var9 = class756.field10976 - 3;
            var10 = 20;
            class106.method1027(class583.field8437 + var4, -357, class756.field10976, class733.field10544, var10, class582.field8424 + var3, class100.field1623.method961(class385.field5684, true), arg0);
            var11 = var3 + class315.field4531.method1630(true);
            var12 = var4 + class315.field4531.method1632(-116);
            if (!class510.field7456) {
               int var13 = 0;
               class587 var14 = (class587)class685.field10080.method2579(-801);
               if (var2 || var14 != null) {
                  do {
                     int var15 = (class103.field1686 + -1 - var13) * 16 + var6 - -var10 + 13;
                     if (~(class582.field8424 - -var3) > ~var11 && ~(class582.field8424 + var3 + class733.field10544) < ~var11 && var12 > var15 + -13 && ~(var15 + 4) < ~var12 && var14.field8490) {
                        arg0.method295(class582.field8424 - -var3, var15 - 12, class733.field10544, 16, -class210.field3133 + 255 << 24 | class543.field7872, 1);
                     }

                     ++var13;
                     var14 = (class587)class685.field10080.method2583(1);
                  } while(var14 != null);
               }

               if (!var2) {
                  break label228;
               }
            }

            int var16 = 0;
            class59 var17 = (class59)class26.field398.method5680(false);
            if (var2 || var17 != null) {
               do {
                  int var18 = var16 * 16 + (var6 - -var10) - -13;
                  ++var16;
                  if (~var11 < ~(class582.field8424 - -var3) && class733.field10544 + class582.field8424 + var3 > var11 && ~(var18 - 13) > ~var12 && var12 < var18 + 4 && (~var17.field1133 < -2 || ((class587)var17.field1134.field11533.field4412).field8490)) {
                     arg0.method295(class582.field8424 - -var3, var18 + -12, class733.field10544, 16, class543.field7872 | -class210.field3133 + 255 << 24, 1);
                  }

                  var17 = (class59)class26.field398.method5676(-13612);
               } while(var17 != null);
            }

            if (class636.field9268 != null) {
               byte var10002;
               label167: {
                  class106.method1027(class82.field1380, -357, class640.field9329, class470.field6832, var10, class401.field5898, class636.field9268.field1132, arg0);
                  int var19 = 0;
                  class587 var20 = (class587)class636.field9268.field1134.method5680(false);
                  if (var2) {
                     var10000 = class82.field1380 + 13 + var10;
                     var10001 = var19;
                     var10002 = 16;
                  } else if (var20 == null) {
                     var10000 = -111;
                     var10001 = class82.field1380;
                     var10002 = var10;
                     if (!var2) {
                        break label167;
                     }
                  } else {
                     var10000 = class82.field1380 + 13 + var10;
                     var10001 = var19;
                     var10002 = 16;
                  }

                  while(true) {
                     int var21 = var10000 - -(var10001 * var10002);
                     ++var19;
                     if (~class401.field5898 > ~var11 && ~var11 > ~(class470.field6832 + class401.field5898) && ~var12 < ~(var21 + -13) && var21 - -4 > var12 && var20.field8490) {
                        arg0.method295(class401.field5898, var21 + -12, class470.field6832, 16, 255 - class210.field3133 << 24 | class543.field7872, 1);
                     }

                     var20 = (class587)class636.field9268.field1134.method5676(-13612);
                     if (var20 == null) {
                        var10000 = -111;
                        var10001 = class82.field1380;
                        var10002 = var10;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = class82.field1380 + 13 + var10;
                        var10001 = var19;
                        var10002 = 16;
                     }
                  }
               }

               class756.method5474((byte)var10000, var10001, var10002, class640.field9329, arg0, class401.field5898, class470.field6832);
            }
         }

         label217: {
            class756.method5474((byte)-110, class583.field8437 + var4, var10, class756.field10976, arg0, class582.field8424 + var3, class733.field10544);
            if (class510.field7456) {
               int var22 = 0;
               class59 var23 = (class59)class26.field398.method5680(false);
               if (var2 || var23 != null) {
                  do {
                     label143: {
                        int var24 = var22 * 16 + var10 + 13 + class583.field8437 + var4;
                        ++var22;
                        if (var23.field1133 == 1) {
                           class385.method2993(var24, var12, class220.field3314 | -16777216, arg0, class583.field8437 + var4, var11, class250.field3583 | -16777216, (byte)-41, class756.field10976, (class587)var23.field1134.field11533.field4412, class582.field8424 + var3, class733.field10544);
                           if (!var2) {
                              break label143;
                           }
                        }

                        class546.method4078(class756.field10976, arg0, class220.field3314 | -16777216, var12, var24, class582.field8424 + var3, var23, class733.field10544, var11, (byte)-67, class583.field8437 - -var4, -16777216 | class250.field3583);
                     }

                     var23 = (class59)class26.field398.method5676(-13612);
                  } while(var23 != null);
               }

               if (class636.field9268 == null) {
                  break label217;
               }

               int var10003;
               int var33;
               label130: {
                  int var25 = 0;
                  class587 var26 = (class587)class636.field9268.field1134.method5680(false);
                  if (var2) {
                     var10000 = var10 + 13;
                     var10001 = class82.field1380;
                     var33 = 16;
                     var10003 = var25;
                  } else if (var26 == null) {
                     var10000 = -1;
                     var10001 = class401.field5898;
                     var33 = class470.field6832;
                     var10003 = class640.field9329;
                     if (!var2) {
                        break label130;
                     }
                  } else {
                     var10000 = var10 + 13;
                     var10001 = class82.field1380;
                     var33 = 16;
                     var10003 = var25;
                  }

                  while(true) {
                     int var27 = var10000 + (var10001 - -(var33 * var10003));
                     class385.method2993(var27, var12, -16777216 | class220.field3314, arg0, class82.field1380, var11, -16777216 | class250.field3583, (byte)-41, class640.field9329, var26, class401.field5898, class470.field6832);
                     ++var25;
                     var26 = (class587)class636.field9268.field1134.method5676(-13612);
                     if (var26 == null) {
                        var10000 = -1;
                        var10001 = class401.field5898;
                        var33 = class470.field6832;
                        var10003 = class640.field9329;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var10 + 13;
                        var10001 = class82.field1380;
                        var33 = 16;
                        var10003 = var25;
                     }
                  }
               }

               class427.method3225(var10000, var10001, var33, var10003, class82.field1380);
               if (!var2) {
                  break label217;
               }
            }

            int var28 = 0;
            class587 var29 = (class587)class685.field10080.method2579(-801);
            if (var2 || var29 != null) {
               do {
                  int var30 = var6 + var10 - (-((-var28 + class103.field1686 + -1) * 16) + -13);
                  ++var28;
                  class385.method2993(var30, var12, -16777216 | class220.field3314, arg0, var6, var11, class250.field3583 | -16777216, (byte)-41, var9, var29, var5, var7);
                  var29 = (class587)class685.field10080.method2583(1);
               } while(var29 != null);
            }
         }

         class427.method3225(-1, class582.field8424 - -var3, class733.field10544, class756.field10976, class583.field8437 - -var4);
      } catch (RuntimeException var32) {
         throw class608.method4462(var32, field994[6] + (arg0 != null ? field994[2] : field994[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(II)Lvba;"
   )
   public final class44 method556(int arg0, int arg1) {
      try {
         ++field993;
         if (arg1 <= 16) {
            field986 = null;
         }

         return new class44(this.field989, arg0, this.field984, this.field990);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field994[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method557(boolean arg0) {
      try {
         field986 = null;
         if (arg0) {
            method557(false);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field994[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method558(byte arg0) {
      try {
         ++field987;
         if (~class241.field3483 == -11) {
            if (arg0 == 38) {
               class241.field3483 = 11;
            }
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field994[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(ZLjava/lang/String;I)V"
   )
   public static final void method559(boolean param0, String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vba",
      name = "<init>",
      descriptor = "(IIII)V"
   )
   public class44(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field989 = arg0;
         this.field990 = arg3;
         this.field984 = arg2;
         this.field991 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field994[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(I)Lhv;"
   )
   public static final class542 method560(int arg0) {
      try {
         ++field985;
         class542 var1 = class116.method1097(0);
         var1.field7865 = null;
         var1.field7857 = 0;
         if (arg0 != 16) {
            method555((class65)null, (byte)-120);
         }

         var1.field7859 = new class200(5000);
         return var1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field994[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method561(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method562(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

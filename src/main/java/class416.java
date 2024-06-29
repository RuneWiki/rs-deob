import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public abstract class class416 {
   @OriginalMember(
      owner = "client!mia",
      name = "b",
      descriptor = "Lc;"
   )
   public class652 field6445;
   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6447 = new String[]{method3324(method3323("\t~r\u0010-L")), method3324(method3323("\t~r\u0010/L")), method3324(method3323("\nb\u007fR")), method3324(method3323("\u001f9=\u0010\u001e")), method3324(method3323("\t~r\u0010_\ryzJ]L"))};
   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "I"
   )
   public static int field6446;
   @OriginalMember(
      owner = "client!mia",
      name = "c",
      descriptor = "[[S"
   )
   public static short[][] field6444;

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(Lbaa;III)V",
      line = 6
   )
   public static final void method3320(class109 arg0, int arg1, int arg2, int arg3) {
      if (arg2 < class247.field3734) {
         class190 var4 = class711.field10694[arg1][arg2 + 1][arg3];
         if (var4 != null && var4.field2952 != null && var4.field2952.method45((byte)-120)) {
            arg0.method44(0, 0, 0, class546.field8193, true, class678.field10091, var4.field2952);
         }
      }

      if (arg3 < class247.field3734) {
         class190 var5 = class711.field10694[arg1][arg2][arg3 + 1];
         if (var5 != null && var5.field2952 != null && var5.field2952.method45((byte)-126)) {
            arg0.method44(0, 0, class678.field10091, class546.field8193, true, 0, var5.field2952);
         }
      }

      if (arg2 < class247.field3734 && arg3 < class365.field5634) {
         class190 var6 = class711.field10694[arg1][arg2 + 1][arg3 + 1];
         if (var6 != null && var6.field2952 != null && var6.field2952.method45((byte)-123)) {
            arg0.method44(0, 0, class678.field10091, class546.field8193, true, class678.field10091, var6.field2952);
         }
      }

      if (arg2 < class247.field3734 && arg3 > 0) {
         class190 var7 = class711.field10694[arg1][arg2 + 1][arg3 - 1];
         if (var7 != null && var7.field2952 != null && var7.field2952.method45((byte)-111)) {
            arg0.method44(0, 0, -class678.field10091, class546.field8193, true, class678.field10091, var7.field2952);
         }
      }

   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(B)V",
      line = 55
   )
   public static void method3321(byte arg0) {
      try {
         field6444 = null;
         if (arg0 < 99) {
            field6444 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6447[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "<init>",
      descriptor = "(Lc;)V",
      line = 69
   )
   public class416(class652 arg0) {
      try {
         this.field6445 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6447[4] + (arg0 != null ? field6447[3] : field6447[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(Lwo;Lpfa;III)V",
      line = 79
   )
   public static final void method3322(class9 arg0, class102 arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field1786;

      try {
         ++field6446;
         byte var6 = -1;
         if ((2048 & arg3) != arg2) {
            var6 = arg1.method2889(true);
         }

         if (~(arg3 & 32768) != -1) {
            label287: {
               arg0.field1664 = arg1.method2889(true);
               arg0.field1673 = arg1.method2886((byte)88);
               arg0.field1667 = arg1.method2852((byte)48);
               arg0.field1676 = arg1.method2837((byte)-93);
               arg0.field1659 = arg1.method2867(arg2 + 28) - -class308.field4801;
               arg0.field1675 = arg1.method2834(7183) + class308.field4801;
               arg0.field1671 = arg1.method2857((byte)117);
               if (!arg0.field107) {
                  arg0.field1664 += arg0.field1683[0];
                  arg0.field1673 += arg0.field1685[0];
                  arg0.field1676 += arg0.field1685[0];
                  arg0.field1667 += arg0.field1683[0];
                  arg0.field1688 = 1;
                  if (!var5) {
                     break label287;
                  }
               }

               arg0.field1676 += arg0.field103;
               arg0.field1664 += arg0.field90;
               arg0.field1688 = 0;
               arg0.field1667 += arg0.field90;
               arg0.field1673 += arg0.field103;
            }

            arg0.field1690 = 0;
         }

         if ((arg3 & 4096) != 0) {
            int var7 = arg1.method2834(arg2 ^ 7183);
            int var8 = arg1.method2885((byte)111);
            if (var7 == 65535) {
               var7 = -1;
            }

            int var9 = arg1.method2868(1318266360);
            int var10 = 7 & var9;
            int var11 = var9 >> 3 & 15;
            if (~var11 == -16) {
               var11 = -1;
            }

            arg0.method1098(var11, false, (byte)79, var8, var7, 1, var10);
         }

         if (~(4 & arg3) != -1) {
            class417.field6452[arg4] = arg1.method2852((byte)48);
         }

         if (~(arg3 & 2) != -1) {
            arg0.field105 = arg1.method2861((byte)61);
            if (~arg0.field1688 == -1) {
               arg0.method1106(arg0.field105, (byte)43);
               arg0.field105 = -1;
            }
         }

         if (~(arg3 & 1024) != -1) {
            int var12 = arg1.method2834(arg2 + 7183);
            arg0.field1634 = arg1.method2868(1318266360);
            arg0.field1597 = arg1.method2877(-31130);
            arg0.field1620 = 32767 & var12;
            arg0.field1631 = ~(var12 & 32768) != -1;
            arg0.field1600 = class308.field4801 + arg0.field1620 - -arg0.field1634;
         }

         if ((16 & arg3) != 0) {
            int var13 = arg1.method2834(7183);
            int var14 = arg1.method2860(true);
            if (~var13 == -65536) {
               var13 = -1;
            }

            int var15 = arg1.method2857((byte)118);
            int var16 = var15 & 7;
            int var17 = var15 >> 3 & 15;
            if (~var17 == -16) {
               var17 = -1;
            }

            arg0.method1098(var17, false, (byte)79, var14, var13, 0, var16);
         }

         if ((arg3 & 131072) != 0) {
            arg0.field1662 = arg1.method2852((byte)48);
            arg0.field1669 = arg1.method2837((byte)-102);
            arg0.field1658 = arg1.method2837((byte)-127);
            arg0.field1663 = (byte)arg1.method2857((byte)117);
            arg0.field1661 = class308.field4801 + arg1.method2867(87);
            arg0.field1665 = class308.field4801 + arg1.method2848(-110);
         }

         if ((128 & arg3) != 0) {
            int var18 = arg1.method2855(arg2 + -31007);
            if (~var18 < -1) {
               int var19 = 0;
               if (var5 || ~var19 > ~var18) {
                  do {
                     int var20;
                     int var21;
                     int var22;
                     int var23;
                     label268: {
                        var20 = -1;
                        var21 = -1;
                        var22 = -1;
                        var23 = arg1.method2896(0);
                        if (var23 == 32767) {
                           var23 = arg1.method2896(0);
                           var21 = arg1.method2896(arg2);
                           var20 = arg1.method2896(0);
                           var22 = arg1.method2896(0);
                           if (!var5) {
                              break label268;
                           }
                        }

                        if (var23 != 32766) {
                           var21 = arg1.method2896(0);
                           if (var5) {
                              var23 = -1;
                           }
                        } else {
                           var23 = -1;
                        }
                     }

                     int var24 = arg1.method2896(0);
                     int var25 = arg1.method2868(1318266360);
                     arg0.method1096(17065, var22, class308.field4801, var21, var23, var24, var25, var20);
                     ++var19;
                  } while(~var19 > ~var18);
               }
            }
         }

         if ((arg3 & 1) != 0) {
            int var26 = arg1.method2861((byte)107);
            if (var26 == 65535) {
               var26 = -1;
            }

            arg0.field1649 = var26;
         }

         if (~(8192 & arg3) != -1) {
            int var27 = arg1.method2855(-31007);
            int[] var28 = new int[var27];
            int[] var29 = new int[var27];
            int[] var30 = new int[var27];
            int var31 = 0;
            if (var5 || ~var31 > ~var27) {
               do {
                  int var32 = arg1.method2867(42);
                  if (var32 == 65535) {
                     var32 = -1;
                  }

                  var28[var31] = var32;
                  var29[var31] = arg1.method2857((byte)127);
                  var30[var31] = arg1.method2848(-111);
                  ++var31;
               } while(~var31 > ~var27);
            }

            class507.method3939(arg0, var28, var30, var29, true);
         }

         if ((arg3 & 524288) != 0) {
            int var33 = arg1.method2861((byte)119);
            if (~var33 == -65536) {
               var33 = -1;
            }

            int var34 = arg1.method2860(true);
            int var35 = arg1.method2857((byte)116);
            int var36 = var35 & 7;
            int var37 = (125 & var35) >> 3;
            if (var37 == 15) {
               var37 = -1;
            }

            arg0.method1098(var37, false, (byte)79, var34, var33, 2, var36);
         }

         if (~(64 & arg3) != -1) {
            int var38 = arg1.method2868(1318266360);
            byte[] var39 = new byte[var38];
            class354 var40 = new class354(var39);
            arg1.method2899(var39, var38, 0, arg2 ^ -73);
            class651.field9384[arg4] = var40;
            arg0.method48(var40, (byte)-34);
         }

         if (~(65536 & arg3) != -1) {
            int var41 = arg1.method2857((byte)122);
            int[] var42 = new int[var41];
            int[] var43 = new int[var41];
            int var44 = 0;
            if (var5 || ~var44 > ~var41) {
               do {
                  int var45 = arg1.method2848(-103);
                  if (~(var45 & 49152) == -49153) {
                     int var46 = arg1.method2867(arg2 + 10);
                     var42[var44] = class119.method1087(var46, var45 << 16);
                     if (var5) {
                        var42[var44] = var45;
                     }
                  } else {
                     var42[var44] = var45;
                  }

                  var43[var44] = arg1.method2848(arg2 + -95);
                  ++var44;
               } while(~var44 > ~var41);
            }

            arg0.method1101((byte)-49, var42, var43);
         }

         if ((arg3 & 262144) != 0) {
            arg0.field78 = arg1.method2877(-31130) == 1;
         }

         if ((arg3 & 32) != 0) {
            int[] var47 = new int[4];
            int var48 = 0;
            if (var5) {
               var47[var48] = arg1.method2834(7183);
               if (~var47[var48] == -65536) {
                  var47[var48] = -1;
               }

               ++var48;
            }

            while(true) {
               while(var48 < 4) {
                  var47[var48] = arg1.method2834(7183);
                  if (~var47[var48] == -65536) {
                     var47[var48] = -1;
                  }

                  ++var48;
               }

               int var49 = arg1.method2877(-31130);
               if (!var5) {
                  class113.method1059(2, arg0, var49, false, var47);
                  break;
               }

               if (2 == -65536) {
                  var47[var48] = -1;
               }

               ++var48;
            }
         }

         if ((512 & arg3) != 0) {
            label182: {
               arg0.field1621 = arg1.method2843(-1);
               if (arg0.field1621.charAt(0) != '~') {
                  if (class476.field7251 != arg0) {
                     break label182;
                  }

                  class242.method2064(arg0.field77, 0, arg0.method52(-106, false), arg0.field1621, -1, arg0.method54(true, 10023), 2);
                  if (!var5) {
                     break label182;
                  }
               }

               arg0.field1621 = arg0.field1621.substring(1);
               class242.method2064(arg0.field77, 0, arg0.method52(99, false), arg0.field1621, -1, arg0.method54(true, 10023), 2);
            }

            arg0.field1605 = 0;
            arg0.field1629 = 150;
            arg0.field1630 = 0;
         }

         if (~(256 & arg3) != -1) {
            arg0.field81 = arg1.method2855(-31007) == 1;
         }

         if (arg0.field107) {
            if (var6 == 127) {
               arg0.method58(arg0.field90, 0, arg0.field103);
            } else {
               byte var50;
               label171: {
                  if (var6 == -1) {
                     var50 = class417.field6452[arg4];
                     if (!var5) {
                        break label171;
                     }
                  }

                  var50 = var6;
               }

               class353.method2829(arg0, var50, arg2 ^ 14478);
               arg0.method59(arg0.field103, arg0.field90, true, var50);
            }
         }
      } catch (RuntimeException var52) {
         throw class482.method3757(var52, field6447[1] + (arg0 != null ? field6447[3] : field6447[2]) + ',' + (arg1 != null ? field6447[3] : field6447[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(Lvda;IB)V"
   )
   public abstract void method1826(class799 arg0, int arg1, byte arg2);

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method1833(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!mia",
      name = "b",
      descriptor = "(B)Z"
   )
   public abstract boolean method1830(byte arg0);

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public abstract void method1828(boolean arg0, boolean arg1);

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(ZI)V"
   )
   public abstract void method1831(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!mia",
      name = "c",
      descriptor = "(B)V"
   )
   public abstract void method1827(byte arg0);

   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

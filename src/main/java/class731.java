import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class731 extends class3 {
   @OriginalMember(
      owner = "client!gn",
      name = "m",
      descriptor = "Z"
   )
   public boolean field10706 = false;
   @OriginalMember(
      owner = "client!gn",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10708 = new String[]{method5327(method5326("\u0002\f1X\u0018")), method5327(method5326("\u001eL1$$Q")), method5327(method5326("\u0017Ws\u001a")), method5327(method5326("\u001eL1%$Q")), method5327(method5326("\u001eL1#$Q")), method5327(method5326("\u001eL1\"$Q")), method5327(method5326("\u001eL1'$Q"))};
   @OriginalMember(
      owner = "client!gn",
      name = "r",
      descriptor = "I"
   )
   public static int field10691 = 0;
   @OriginalMember(
      owner = "client!gn",
      name = "y",
      descriptor = "B"
   )
   public byte field10701;
   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "B"
   )
   public byte field10702;
   @OriginalMember(
      owner = "client!gn",
      name = "s",
      descriptor = "I"
   )
   public int field10692;
   @OriginalMember(
      owner = "client!gn",
      name = "q",
      descriptor = "I"
   )
   public int field10693;
   @OriginalMember(
      owner = "client!gn",
      name = "n",
      descriptor = "I"
   )
   public int field10694;
   @OriginalMember(
      owner = "client!gn",
      name = "w",
      descriptor = "I"
   )
   public static int field10696;
   @OriginalMember(
      owner = "client!gn",
      name = "o",
      descriptor = "I"
   )
   public int field10697;
   @OriginalMember(
      owner = "client!gn",
      name = "t",
      descriptor = "I"
   )
   public int field10699;
   @OriginalMember(
      owner = "client!gn",
      name = "k",
      descriptor = "I"
   )
   public static int field10700;
   @OriginalMember(
      owner = "client!gn",
      name = "v",
      descriptor = "I"
   )
   public static int field10704;
   @OriginalMember(
      owner = "client!gn",
      name = "x",
      descriptor = "I"
   )
   public static int field10705;
   @OriginalMember(
      owner = "client!gn",
      name = "l",
      descriptor = "I"
   )
   public int field10707;
   @OriginalMember(
      owner = "client!gn",
      name = "p",
      descriptor = "Lgn;"
   )
   public class731 field10695;
   @OriginalMember(
      owner = "client!gn",
      name = "u",
      descriptor = "Z"
   )
   public boolean field10703;
   @OriginalMember(
      owner = "client!gn",
      name = "j",
      descriptor = "[Ls;"
   )
   public static class295[] field10698;

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(Lha;ZLgn;IIII)V"
   )
   public abstract void method233(class66 arg0, boolean arg1, class731 arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!gn",
      name = "f",
      descriptor = "(I)I"
   )
   public abstract int method232(int arg0);

   @OriginalMember(
      owner = "client!gn",
      name = "i",
      descriptor = "(B)Z"
   )
   public abstract boolean method1764(byte arg0);

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5321(int arg0, byte arg1) {
      boolean var2 = client.field4360;

      try {
         ++field10700;
         if (~class622.field9156 != ~arg0) {
            if (~arg0 == -15 || ~arg0 == -16) {
               class106.method868(-3965);
            }

            if (~arg0 != -15 && class592.field8716 != null) {
               class592.field8716.method1377(false);
               class592.field8716 = null;
            }

            if (arg0 == 3) {
               class183.method1458(class185.field2623 != class156.field2224, -1001);
            }

            if (arg0 == 7) {
               class754.method5470(8, ~class477.field6862 != ~class185.field2623);
            }

            label142: {
               if (~arg0 != -6 && ~arg0 != -14) {
                  if (arg0 != 6 && ~arg0 != -10) {
                     break label142;
                  }

                  class106.method868(-3965);
                  if (!var2) {
                     break label142;
                  }
               }

               class228.method1780((byte)-24);
            }

            if (class709.method5157(class622.field9156, 12)) {
               class418.field6003.field3692 = 2;
               class249.field3427.field3692 = 2;
               class617.field9088.field3692 = 2;
               class666.field9672.field3692 = 2;
               class612.field8985.field3692 = 2;
               class80.field1051.field3692 = 2;
               class170.field2370.field3692 = 2;
            }

            if (arg1 > -79) {
               field10691 = -17;
            }

            if (class709.method5157(arg0, 12)) {
               class679.field10000 = 1;
               class26.field412 = 0;
               class144.field1834 = 0;
               class73.field904 = 0;
               class287.field3963 = 1;
               class389.method2954(true, (byte)-107);
               class418.field6003.field3692 = 1;
               class249.field3427.field3692 = 1;
               class617.field9088.field3692 = 1;
               class666.field9672.field3692 = 1;
               class612.field8985.field3692 = 1;
               class80.field1051.field3692 = 1;
               class170.field2370.field3692 = 1;
            }

            if (~arg0 == -13 || ~arg0 == -4) {
               class581.method4206((byte)27);
            }

            boolean var3 = ~arg0 == -3 || class787.method5675(arg0, -83) || class426.method3155(true, arg0);
            boolean var4 = ~class622.field9156 == -3 || class787.method5675(class622.field9156, -60) || class426.method3155(true, class622.field9156);
            if (!var4 == var3) {
               label110: {
                  if (var3) {
                     label107: {
                        class497.field7205 = class578.field8531;
                        if (~class300.field4107.field6405.method4286(-23) != -1) {
                           class545.method3916(false, 2, class578.field8531, class707.field10327, class300.field4107.field6405.method4286(-122), (byte)-112, 0);
                           class488.method3544(-2);
                           if (!var2) {
                              break label107;
                           }
                        }

                        class584.method4259((byte)-116, 2);
                     }

                     class667.field9694.method3014((byte)-118, false);
                     if (!var2) {
                        break label110;
                     }
                  }

                  class584.method4259((byte)-116, 2);
                  class667.field9694.method3014((byte)-76, true);
               }
            }

            if (class709.method5157(arg0, 12) || arg0 == 14 || arg0 == 15) {
               class383.field5543.method510();
            }

            class622.field9156 = arg0;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10708[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(ZLha;)Z"
   )
   public abstract boolean method1762(boolean arg0, class66 arg1);

   @OriginalMember(
      owner = "client!gn",
      name = "g",
      descriptor = "(B)V"
   )
   public static void method5322(byte arg0) {
      try {
         if (arg0 <= 29) {
            field10698 = null;
         }

         field10698 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10708[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(Lha;I)Lmk;"
   )
   public abstract class62 method244(class66 arg0, int arg1);

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "([Lmn;Z)I"
   )
   public abstract int method1763(class389[] arg0, boolean arg1);

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(III[Lmn;)I"
   )
   public final int method5323(int arg0, int arg1, int arg2, class389[] arg3) {
      boolean var5 = client.field4360;

      try {
         int var10;
         int var11;
         label52: {
            ++field10696;
            long var6 = class409.field5919[this.field10701][arg0][arg2];
            long var8 = 0L;
            var10 = 0;
            if (var5) {
               var11 = (int)(65535L & var6 >> (int)var8);
            } else if (var8 > 48L) {
               var11 = var10;
               if (!var5) {
                  break label52;
               }
            } else {
               var11 = (int)(65535L & var6 >> (int)var8);
            }

            label51:
            while(true) {
               while(~var11 >= -1) {
                  var11 = var10;
                  if (!var5) {
                     break label51;
                  }
               }

               var8 += 16L;
               arg3[var10++] = class220.field3145[var11 + -1].field9324;
               if (var8 > 48L) {
                  var11 = var10;
                  if (!var5) {
                     break;
                  }
               } else {
                  var11 = (int)(65535L & var6 >> (int)var8);
               }
            }
         }

         if (var5) {
            arg3[var11] = null;
            ++var11;
         }

         while(true) {
            while(~var11 > -5) {
               arg3[var11] = null;
               ++var11;
            }

            int var12 = 113 / ((arg1 - -5) / 52);
            if (!var5) {
               return var10;
            }

            ++var11;
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field10708[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10708[0] : field10708[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(Z)Z"
   )
   public abstract boolean method239(boolean arg0);

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(Lha;Z)V"
   )
   public abstract void method245(class66 arg0, boolean arg1);

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method5324(int arg0, int arg1, int arg2) {
      class517 var3 = class663.field9659[arg0][arg1][arg2];
      if (var3 != null) {
         class32.method286(var3.field7474);
         class32.method286(var3.field7475);
         if (var3.field7474 != null) {
            var3.field7474 = null;
         }

         if (var3.field7475 != null) {
            var3.field7475 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!gn",
      name = "e",
      descriptor = "(I)I"
   )
   public abstract int method248(int arg0);

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(IILha;I)Z"
   )
   public abstract boolean method251(int arg0, int arg1, class66 arg2, int arg3);

   @OriginalMember(
      owner = "client!gn",
      name = "e",
      descriptor = "(B)V"
   )
   public abstract void method241(byte arg0);

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(ZILha;I)Lwja;"
   )
   public static final class281 method5325(boolean arg0, int arg1, class66 arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         ++field10704;
         if (~arg3 == 0) {
            return null;
         } else {
            if (class707.field10328 != null) {
               int var5 = 0;
               if (var4 || ~var5 > ~class707.field10328.length) {
                  do {
                     if (class707.field10328[var5] == arg3) {
                        return class379.field5462[var5];
                     }

                     ++var5;
                  } while(~var5 > ~class707.field10328.length);
               }
            }

            class281 var6 = (class281)class157.field2246.method725(0, (long)arg3);
            if (var6 != null) {
               if (arg0 && var6.field3908 == null) {
                  class206 var7 = class73.method674(arg3, class49.field638, (byte)-11);
                  if (var7 == null) {
                     return null;
                  }

                  var6.field3908 = var7;
               }

               return var6;
            } else {
               class439[] var8 = class439.method3232(class161.field2300, arg3);
               if (var8 == null) {
                  return null;
               } else {
                  class206 var9 = class73.method674(arg3, class49.field638, (byte)121);
                  if (var9 == null) {
                     return null;
                  } else {
                     class281 var10;
                     label58: {
                        if (arg0) {
                           var10 = new class281(arg2.method502(var9, var8, true), var9);
                           if (!var4) {
                              break label58;
                           }
                        }

                        var10 = new class281(arg2.method502(var9, var8, true));
                     }

                     class157.field2246.method723(0, (long)arg3, var10);
                     if (arg1 >= -76) {
                        method5321(-16, (byte)119);
                     }

                     return var10;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field10708[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10708[0] : field10708[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "c",
      descriptor = "(ILha;)Lth;"
   )
   public abstract class623 method242(int arg0, class66 arg1);

   @OriginalMember(
      owner = "client!gn",
      name = "d",
      descriptor = "(B)Z"
   )
   public abstract boolean method238(byte arg0);

   @OriginalMember(
      owner = "client!gn",
      name = "f",
      descriptor = "(B)I"
   )
   public int method3670(byte arg0) {
      try {
         ++field10705;
         if (arg0 != 28) {
            this.field10707 = 23;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10708[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "h",
      descriptor = "(B)Z"
   )
   public abstract boolean method253(byte arg0);

   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5326(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5327(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

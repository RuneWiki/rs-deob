import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class490 extends class15 {
   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "Z"
   )
   public boolean field6846 = true;
   @OriginalMember(
      owner = "client!qm",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6853 = new String[]{method3729(method3728("\u0017%\u0006U")), method3729(method3728("\b=D\u007fn")), method3729(method3728("\u0002~D\u0017;")), method3729(method3728("\b=Dqn")), method3729(method3728("\b=Dzn")), method3729(method3728("\b=Dtn")), method3729(method3728("\b=D{n")), method3729(method3728("W~D")), method3729(method3728("\b=Dxn")), method3729(method3728("\b=D}n")), method3729(method3728("\b=D|n")), method3729(method3728("\b=D~n")), method3729(method3728("\b=Dun"))};
   @OriginalMember(
      owner = "client!qm",
      name = "w",
      descriptor = "I"
   )
   public static int field6835;
   @OriginalMember(
      owner = "client!qm",
      name = "t",
      descriptor = "I"
   )
   public static int field6836;
   @OriginalMember(
      owner = "client!qm",
      name = "x",
      descriptor = "I"
   )
   public static int field6837;
   @OriginalMember(
      owner = "client!qm",
      name = "E",
      descriptor = "I"
   )
   public static int field6839;
   @OriginalMember(
      owner = "client!qm",
      name = "H",
      descriptor = "I"
   )
   public static int field6840;
   @OriginalMember(
      owner = "client!qm",
      name = "v",
      descriptor = "I"
   )
   public static int field6843;
   @OriginalMember(
      owner = "client!qm",
      name = "C",
      descriptor = "I"
   )
   public static int field6845;
   @OriginalMember(
      owner = "client!qm",
      name = "F",
      descriptor = "I"
   )
   public static int field6847;
   @OriginalMember(
      owner = "client!qm",
      name = "D",
      descriptor = "I"
   )
   public static int field6848;
   @OriginalMember(
      owner = "client!qm",
      name = "s",
      descriptor = "I"
   )
   public static int field6849;
   @OriginalMember(
      owner = "client!qm",
      name = "J",
      descriptor = "I"
   )
   public static int field6851;
   @OriginalMember(
      owner = "client!qm",
      name = "u",
      descriptor = "Lfo;"
   )
   public class682 field6852;
   @OriginalMember(
      owner = "client!qm",
      name = "y",
      descriptor = "[I"
   )
   public int[] field6842;
   @OriginalMember(
      owner = "client!qm",
      name = "L",
      descriptor = "[I"
   )
   private int[] field6850;
   @OriginalMember(
      owner = "client!qm",
      name = "A",
      descriptor = "[Ltk;"
   )
   public static class111[] field6838;
   @OriginalMember(
      owner = "client!qm",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field6844;
   @OriginalMember(
      owner = "client!qm",
      name = "I",
      descriptor = "[[I"
   )
   private int[][] field6841;

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method3718(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 31512) {
            this.method3723((byte)89, (class66)null, (int[])null);
         }

         ++field6835;
         if (this.field6850 != null && arg0 >= 0 && this.field6850.length >= arg0) {
            return this.field6841[arg0] != null && arg2 >= 0 && arg2 <= this.field6841[arg0].length ? this.field6841[arg0][arg2] : -1;
         } else {
            return -1;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6853[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(IILgea;)V"
   )
   private final void method3719(int arg0, int arg1, class66 arg2) {
      boolean var4 = client.field1481;

      try {
         label103: {
            ++field6839;
            if (arg1 != 1) {
               if (~arg1 == -3) {
                  int var5 = arg2.method640(255);
                  this.field6842 = new int[var5];
                  int var6 = 0;
                  if (var4) {
                     this.field6842[var6] = arg2.method603(-2);
                     ++var6;
                  }

                  while(true) {
                     while(~var5 < ~var6) {
                        this.field6842[var6] = arg2.method603(-2);
                        ++var6;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label103;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               if (~arg1 != -4) {
                  if (arg1 != 4) {
                     break label103;
                  }

                  this.field6846 = false;
                  if (!var4) {
                     break label103;
                  }
               }

               int var7 = arg2.method640(arg0 ^ 6047);
               this.field6850 = new int[var7];
               this.field6841 = new int[var7][];
               int var8 = 0;
               if (var4 || ~var7 < ~var8) {
                  do {
                     int var9 = arg2.method603(arg0 + -5986);
                     class681 var10 = class723.method5245(var9, 0);
                     if (var10 == null) {
                        ++var8;
                     } else {
                        this.field6850[var8] = var9;
                        this.field6841[var8] = new int[var10.field10028];
                        int var11 = 0;
                        if (var4) {
                           this.field6841[var8][var11] = arg2.method603(-2);
                           ++var11;
                        }

                        while(~var10.field10028 < ~var11) {
                           this.field6841[var8][var11] = arg2.method603(-2);
                           ++var11;
                        }

                        ++var8;
                     }
                  } while(~var7 < ~var8);
               }

               if (!var4) {
                  break label103;
               }
            }

            this.field6844 = class61.method549(arg2.method606(11856), '<', true);
         }

         if (arg0 != 5984) {
            this.method3719(28, 111, (class66)null);
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field6853[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6853[2] : field6853[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(Lgea;I)Ljava/lang/String;"
   )
   public final String method3720(class66 arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field6849;
         if (arg1 != -12942) {
            this.method3727((byte)-75);
         }

         StringBuffer var4 = new StringBuffer(80);
         if (this.field6850 != null) {
            int var5 = 0;
            if (var3 || var5 < this.field6850.length) {
               do {
                  var4.append(this.field6844[var5]);
                  var4.append(this.field6852.method4966(arg0.method625(arg1 ^ -12942, class723.method5245(this.field6850[var5], arg1 + 12942).field10027), this.method3724(-1, var5), this.field6841[var5], (byte)102));
                  ++var5;
               } while(var5 < this.field6850.length);
            }
         }

         var4.append(this.field6844[this.field6844.length + -1]);
         return var4.toString();
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6853[1] + (arg0 != null ? field6853[2] : field6853[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3721(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3722(boolean arg0) {
      try {
         field6838 = null;
         if (!arg0) {
            method3722(true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6853[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(BLgea;[I)V"
   )
   public final void method3723(byte arg0, class66 arg1, int[] arg2) {
      boolean var4 = client.field1481;

      try {
         ++field6845;
         if (this.field6850 != null) {
            int var10000;
            int var10001;
            label66: {
               int var5 = 0;
               int var6;
               if (var4) {
                  var6 = this.method3724(arg0 + -54, var5).field10023;
                  if (var6 > 0) {
                     arg1.method631(8, var6, (long)arg2[var5]);
                  }

                  ++var5;
               }

               while(~var5 > ~this.field6850.length) {
                  var10000 = ~arg2.length;
                  var10001 = ~var5;
                  if (var4) {
                     break label66;
                  }

                  if (var10000 >= var10001) {
                     break;
                  }

                  var6 = this.method3724(arg0 + -54, var5).field10023;
                  if (var6 > 0) {
                     arg1.method631(8, var6, (long)arg2[var5]);
                  }

                  ++var5;
               }

               var10000 = arg0;
               var10001 = 53;
            }

            if (var10000 != var10001) {
               this.method3719(-38, -127, (class66)null);
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6853[10] + arg0 + ',' + (arg1 != null ? field6853[2] : field6853[0]) + ',' + (arg2 != null ? field6853[2] : field6853[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(II)Lfea;"
   )
   public final class681 method3724(int arg0, int arg1) {
      try {
         if (arg0 != -1) {
            this.method3723((byte)46, (class66)null, (int[])null);
         }

         ++field6851;
         return this.field6850 != null && ~arg1 <= -1 && ~arg1 >= ~this.field6850.length ? class723.method5245(this.field6850[arg1], 0) : null;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6853[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(Lgea;B)V"
   )
   public final void method3725(class66 arg0, byte arg1) {
      boolean var3 = client.field1481;

      try {
         ++field6843;
         int var4 = 36 % ((-25 - arg1) / 59);

         do {
            int var5 = arg0.method640(255);
            if (var5 == 0) {
               break;
            }

            this.method3719(5984, var5, arg0);
         } while(!var3);

      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6853[11] + (arg0 != null ? field6853[2] : field6853[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "d",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method3726(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field6840;
         StringBuffer var3 = new StringBuffer(80);
         if (this.field6844 == null) {
            return "";
         } else {
            var3.append(this.field6844[arg0]);
            int var4 = 1;
            if (var2) {
               var3.append(field6853[7]);
               var3.append(this.field6844[var4]);
               ++var4;
            }

            while(true) {
               while(~var4 > ~this.field6844.length) {
                  var3.append(field6853[7]);
                  var3.append(this.field6844[var4]);
                  ++var4;
               }

               if (!var2) {
                  return var3.toString();
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6853[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3727(byte arg0) {
      try {
         ++field6837;
         int var2 = 122 / ((arg0 - -35) / 44);
         return this.field6850 == null ? 0 : this.field6850.length;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6853[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3728(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3729(char[] arg0) {
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
            var10005 = 80;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

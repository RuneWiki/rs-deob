import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class651 extends class546 {
   @OriginalMember(
      owner = "client!tl",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9138 = new String[]{method4722(method4721("~\u001a2ae")), method4722(method4721("qX2\r0")), method4722(method4721("d\u0003pO")), method4722(method4721("~\u001a2ge")), method4722(method4721("~\u001a2`e")), method4722(method4721("~\u001a2ee")), method4722(method4721("~\u001a2fe")), method4722(method4721("~\u001a2de")), method4722(method4721("~\u001a2be"))};
   @OriginalMember(
      owner = "client!tl",
      name = "x",
      descriptor = "I"
   )
   public static int field9127;
   @OriginalMember(
      owner = "client!tl",
      name = "F",
      descriptor = "I"
   )
   public static int field9129;
   @OriginalMember(
      owner = "client!tl",
      name = "D",
      descriptor = "I"
   )
   public static int field9130;
   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "I"
   )
   public static int field9134;
   @OriginalMember(
      owner = "client!tl",
      name = "t",
      descriptor = "I"
   )
   public static int field9135;
   @OriginalMember(
      owner = "client!tl",
      name = "E",
      descriptor = "I"
   )
   public static int field9136;
   @OriginalMember(
      owner = "client!tl",
      name = "u",
      descriptor = "I"
   )
   public static int field9137;
   @OriginalMember(
      owner = "client!tl",
      name = "A",
      descriptor = "Ljava/lang/String;"
   )
   public String field9133;
   @OriginalMember(
      owner = "client!tl",
      name = "y",
      descriptor = "[C"
   )
   public char[] field9126;
   @OriginalMember(
      owner = "client!tl",
      name = "B",
      descriptor = "[C"
   )
   public char[] field9131;
   @OriginalMember(
      owner = "client!tl",
      name = "v",
      descriptor = "[I"
   )
   public int[] field9128;
   @OriginalMember(
      owner = "client!tl",
      name = "w",
      descriptor = "[I"
   )
   public int[] field9132;

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4714(int arg0) {
      boolean var2 = client.field4273;

      try {
         if (this.field9128 != null) {
            int var3 = 0;
            if (var2 || ~this.field9128.length < ~var3) {
               do {
                  this.field9128[var3] = class283.method2155(this.field9128[var3], 32768);
                  ++var3;
               } while(~this.field9128.length < ~var3);
            }
         }

         ++field9134;
         if (this.field9132 != null) {
            int var4 = 0;
            if (var2 || ~this.field9132.length < ~var4) {
               do {
                  this.field9132[var4] = class283.method2155(this.field9132[var4], 32768);
                  ++var4;
               } while(~this.field9132.length < ~var4);
            }
         }

         if (arg0 != 32768) {
            this.field9131 = null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9138[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(Lwm;Z)V"
   )
   public final void method4715(class594 arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         ++field9130;
         if (arg1) {
            do {
               int var4 = arg0.method4288((byte)122);
               if (var4 == 0) {
                  break;
               }

               this.method4719(arg0, var4, (byte)-121);
            } while(!var3);

         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9138[3] + (arg0 != null ? field9138[1] : field9138[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(ILeb;)V"
   )
   public static final void method4716(int arg0, class657 arg1) {
      try {
         ++field9127;
         if (arg0 != 2) {
            method4717((Canvas)null, (byte)46);
         }

         int var3;
         int var4;
         label25: {
            class657 var2 = class741.method5367(arg1, -107);
            if (var2 != null) {
               var3 = var2.field9360;
               var4 = var2.field9379;
               if (!client.field4273) {
                  break label25;
               }
            }

            var3 = class41.field479;
            var4 = class252.field3194;
         }

         class318.method2388(arg1, var4, (byte)-123, var3, false);
         class150.method1251(arg1, true, var3, var4);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9138[7] + arg0 + ',' + (arg1 != null ? field9138[1] : field9138[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;B)V"
   )
   public static final void method4717(Canvas arg0, byte arg1) {
      try {
         ++field9137;
         if (arg1 != 9) {
            method4716(3, (class657)null);
         }

         Dimension var2 = arg0.getSize();
         class316.method2374(var2.height, var2.width, (byte)102);
         if (~class616.field8588 != -2) {
            class633.field8958.method585(arg0, class192.field2343, class314.field4187);
         } else {
            class633.field8958.method585(arg0, class40.field462, class459.field6289);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9138[6] + (arg0 != null ? field9138[1] : field9138[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(IC)I"
   )
   public final int method4718(int arg0, char arg1) {
      boolean var3 = client.field4273;

      try {
         ++field9129;
         if (this.field9132 == null) {
            return -1;
         } else {
            int var4 = 0;
            if (var3) {
               if (~this.field9131[var4] == ~arg1) {
                  return this.field9132[var4];
               }

               ++var4;
            }

            while(true) {
               while(this.field9132.length > var4) {
                  if (~this.field9131[var4] == ~arg1) {
                     return this.field9132[var4];
                  }

                  ++var4;
               }

               if (!var3) {
                  if (arg0 != 18766) {
                     this.method4715((class594)null, false);
                  }

                  return -1;
               }

               if (arg0 == 18766) {
                  return this.field9132[var4];
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9138[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(Lwm;IB)V"
   )
   private final void method4719(class594 arg0, int arg1, byte arg2) {
      boolean var4 = client.field4273;

      try {
         if (arg2 < -115) {
            ++field9136;
            if (arg1 != 1) {
               if (arg1 == 2) {
                  int var5 = arg0.method4288((byte)60);
                  this.field9131 = new char[var5];
                  this.field9132 = new int[var5];
                  int var6 = 0;
                  if (var4) {
                     this.field9132[var6] = arg0.method4280(-19104);
                  } else if (var6 >= var5) {
                     if (!var4) {
                        return;
                     }
                  } else {
                     this.field9132[var6] = arg0.method4280(-19104);
                  }

                  while(true) {
                     byte var7 = arg0.method4340(409855200);
                     this.field9131[var6] = ~var7 == -1 ? 0 : class90.method855(var7, (byte)-84);
                     ++var6;
                     if (var6 >= var5) {
                        if (!var4) {
                           return;
                        }
                     } else {
                        this.field9132[var6] = arg0.method4280(-19104);
                     }
                  }
               }

               if (arg1 == 3) {
                  int var8 = arg0.method4288((byte)121);
                  this.field9128 = new int[var8];
                  this.field9126 = new char[var8];
                  int var9 = 0;
                  if (var4) {
                     this.field9128[var9] = arg0.method4280(-19104);
                  } else if (var8 <= var9) {
                     if (!var4) {
                        return;
                     }
                  } else {
                     this.field9128[var9] = arg0.method4280(-19104);
                  }

                  while(true) {
                     byte var10 = arg0.method4340(409855200);
                     this.field9126[var9] = var10 == 0 ? 0 : class90.method855(var10, (byte)123);
                     ++var9;
                     if (var8 <= var9) {
                        if (!var4) {
                           return;
                        }
                     } else {
                        this.field9128[var9] = arg0.method4280(-19104);
                     }
                  }
               }
            } else {
               this.field9133 = arg0.method4291(-3);
            }

         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field9138[8] + (arg0 != null ? field9138[1] : field9138[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(CI)I"
   )
   public final int method4720(char arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field9135;
         if (this.field9128 == null) {
            return -1;
         } else {
            int var4 = 0;
            int var5 = 79 % ((31 - arg1) / 43);
            if (var3) {
               if (this.field9126[var4] == arg0) {
                  return this.field9128[var4];
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (var4 >= this.field9128.length) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = this.field9126[var4];
               }

               if (var10000 == arg0) {
                  return this.field9128[var4];
               }

               ++var4;
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9138[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4721(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4722(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class277 extends class748 {
   @OriginalMember(
      owner = "client!mda",
      name = "E",
      descriptor = "[[B"
   )
   private byte[][] field3703 = new byte[10][];
   @OriginalMember(
      owner = "client!mda",
      name = "H",
      descriptor = "Lwm;"
   )
   private class594 field3697 = new class594((byte[])null);
   @OriginalMember(
      owner = "client!mda",
      name = "O",
      descriptor = "Lwm;"
   )
   private class594 field3705 = new class594((byte[])null);
   @OriginalMember(
      owner = "client!mda",
      name = "G",
      descriptor = "I"
   )
   private int field3701;
   @OriginalMember(
      owner = "client!mda",
      name = "L",
      descriptor = "Lqh;"
   )
   private class74 field3695;
   @OriginalMember(
      owner = "client!mda",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3706 = new String[]{method2112(method2111("[C\u0003gV\u001e")), method2112(method2111("XR\u000e%")), method2112(method2111("[C\u0003g9_I\u000b=;\u001e")), method2112(method2111("M\tLgx")), method2112(method2111("[C\u0003gW\u001e")), method2112(method2111("[C\u0003gT\u001e")), method2112(method2111("[C\u0003gQ\u001e")), method2112(method2111("[C\u0003gL\u001e"))};
   @OriginalMember(
      owner = "client!mda",
      name = "Q",
      descriptor = "Lbga;"
   )
   public static class378 field3696 = new class378(64, 3);
   @OriginalMember(
      owner = "client!mda",
      name = "I",
      descriptor = "I"
   )
   public static int field3693;
   @OriginalMember(
      owner = "client!mda",
      name = "K",
      descriptor = "I"
   )
   public static int field3698;
   @OriginalMember(
      owner = "client!mda",
      name = "J",
      descriptor = "I"
   )
   public static int field3699;
   @OriginalMember(
      owner = "client!mda",
      name = "M",
      descriptor = "I"
   )
   public static int field3700;
   @OriginalMember(
      owner = "client!mda",
      name = "P",
      descriptor = "I"
   )
   private int field3702;
   @OriginalMember(
      owner = "client!mda",
      name = "F",
      descriptor = "I"
   )
   public static int field3704;
   @OriginalMember(
      owner = "client!mda",
      name = "N",
      descriptor = "[I"
   )
   private int[] field3694;

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(ILwm;)Lot;"
   )
   public static final class620 method2106(int arg0, class594 arg1) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field3693;
            return new class620(arg1.method4333(-67), arg1.method4333(-107), arg1.method4333(-56), arg1.method4333(arg0 ^ -68), arg1.method4293(arg0 + 56), arg1.method4293(87), arg1.method4288((byte)97));
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3706[5] + arg0 + ',' + (arg1 != null ? field3706[3] : field3706[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "j",
      descriptor = "(I)V"
   )
   public final void method2107(int arg0) {
      boolean var2 = client.field4273;

      try {
         if (arg0 > 48) {
            ++field3698;
            if (this.field3694 != null) {
               int var3 = 0;
               if (!var2) {
                  if (var3 >= 10) {
                     return;
                  }

                  if (this.field3702 + var3 >= this.field3694.length) {
                     return;
                  }
               }

               do {
                  if (this.field3703[var3] == null && this.field3695.method724(-25048, this.field3694[this.field3702 + var3], 0)) {
                     this.field3703[var3] = this.field3695.method732(0, this.field3694[this.field3702 + var3], (byte)102);
                  }

                  ++var3;
                  if (var3 >= 10) {
                     return;
                  }
               } while(this.field3702 + var3 < this.field3694.length);

            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3706[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "([BB)I"
   )
   public final int method2108(byte[] arg0, byte arg1) throws IOException {
      boolean var3 = client.field4273;

      try {
         ++field3700;
         if (this.field3694 == null) {
            if (!this.field3695.method724(-25048, this.field3701, 0)) {
               return 0;
            }

            byte[] var4 = this.field3695.method732(0, this.field3701, (byte)81);
            if (var4 == null) {
               throw new IllegalStateException("");
            }

            this.field3705.field8227 = var4;
            this.field3705.field8243 = 0;
            int var5 = var4.length >> 1;
            this.field3694 = new int[var5];
            int var6 = 0;
            if (var3 || var6 < var5) {
               do {
                  this.field3694[var6] = this.field3705.method4280(-19104);
                  ++var6;
               } while(var6 < var5);
            }
         }

         if (~this.field3702 <= ~this.field3694.length) {
            return -1;
         } else {
            this.method2107(115);
            this.field3705.field8227 = arg0;
            this.field3705.field8243 = 0;
            if (!var3 && ~this.field3705.field8227.length >= ~this.field3705.field8243) {
               if (arg1 <= 59) {
                  this.field3694 = null;
               }

               this.field3705.field8227 = null;
               return arg0.length;
            } else {
               label102:
               do {
                  if (this.field3697.field8227 == null) {
                     if (this.field3703[0] == null) {
                        this.field3705.field8227 = null;
                        return this.field3705.field8243;
                     }

                     this.field3697.field8227 = this.field3703[0];
                  }

                  int var7 = this.field3705.field8227.length + -this.field3705.field8243;
                  int var8 = this.field3697.field8227.length + -this.field3697.field8243;
                  int var10000 = ~var8;

                  do {
                     if (var10000 < ~var7) {
                        this.field3697.method4276(this.field3705.field8227, var7, 0, this.field3705.field8243);
                        this.field3705.field8227 = null;
                        return arg0.length;
                     }

                     this.field3705.method4321(var8, this.field3697.field8243, 110909448, this.field3697.field8227);
                     this.field3697.field8243 = 0;
                     ++this.field3702;
                     this.field3697.field8227 = null;
                     int var9 = 0;
                     if (var3) {
                        this.field3703[var9] = this.field3703[var9 + 1];
                        ++var9;
                     }

                     while(true) {
                        while(~var9 > -10) {
                           this.field3703[var9] = this.field3703[var9 + 1];
                           ++var9;
                        }

                        this.field3703[9] = null;
                        if (!var3) {
                           if (this.field3702 < this.field3694.length) {
                              continue label102;
                           }

                           this.field3705.field8227 = null;
                           var10000 = this.field3705.field8243;
                           break;
                        }

                        this.field3703[var9] = this.field3703[var9 + 1];
                        ++var9;
                     }
                  } while(var3);

                  return var10000;
               } while(~this.field3705.field8227.length < ~this.field3705.field8243);

               if (arg1 <= 59) {
                  this.field3694 = null;
               }

               this.field3705.field8227 = null;
               return arg0.length;
            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field3706[7] + (arg0 != null ? field3706[3] : field3706[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "k",
      descriptor = "(I)V"
   )
   public static void method2109(int arg0) {
      try {
         if (arg0 <= 105) {
            method2106(-101, (class594)null);
         }

         field3696 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3706[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "<init>",
      descriptor = "(ILqh;I)V"
   )
   public class277(int arg0, class74 arg1, int arg2) {
      super(arg0);

      try {
         this.field3701 = arg2;
         this.field3695 = arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3706[2] + arg0 + ',' + (arg1 != null ? field3706[3] : field3706[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method2110(boolean arg0) {
      try {
         if (class61.field671.field3257 && ~class97.field1272.field6242 != 0) {
            class543.method3926(class97.field1272.field6242, -29330, class97.field1272.field6244);
         }

         ++field3699;
         if (!arg0) {
            field3696 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3706[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2111(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2112(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class213 extends class555 {
   @OriginalMember(
      owner = "client!oc",
      name = "W",
      descriptor = "[[B"
   )
   private byte[][] field2711 = new byte[10][];
   @OriginalMember(
      owner = "client!oc",
      name = "Q",
      descriptor = "Ljj;"
   )
   private class128 field2707 = new class128((byte[])null);
   @OriginalMember(
      owner = "client!oc",
      name = "U",
      descriptor = "Ljj;"
   )
   private class128 field2712 = new class128((byte[])null);
   @OriginalMember(
      owner = "client!oc",
      name = "X",
      descriptor = "Leaa;"
   )
   private class526 field2702;
   @OriginalMember(
      owner = "client!oc",
      name = "M",
      descriptor = "I"
   )
   private int field2701;
   @OriginalMember(
      owner = "client!oc",
      name = "Y",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2713 = new String[]{method1618(method1617("7\f|;f")), method1618(method1617("6\u001a>\u0004")), method1618(method1617("7\f|\"f")), method1618(method1617("#A|F3")), method1618(method1617("7\f|<f")), method1618(method1617("7\f|>f")), method1618(method1617("7\f|T'6\u0006&Vf")), method1618(method1617("7\f|=f"))};
   @OriginalMember(
      owner = "client!oc",
      name = "S",
      descriptor = "[I"
   )
   public static int[] field2697 = new int[8];
   @OriginalMember(
      owner = "client!oc",
      name = "T",
      descriptor = "[[I"
   )
   public static int[][] field2700 = new int[128][128];
   @OriginalMember(
      owner = "client!oc",
      name = "P",
      descriptor = "I"
   )
   public static int field2703 = 0;
   @OriginalMember(
      owner = "client!oc",
      name = "J",
      descriptor = "I"
   )
   public static int field2705 = -1;
   @OriginalMember(
      owner = "client!oc",
      name = "O",
      descriptor = "Z"
   )
   public static boolean field2708 = false;
   @OriginalMember(
      owner = "client!oc",
      name = "V",
      descriptor = "I"
   )
   public static int field2698;
   @OriginalMember(
      owner = "client!oc",
      name = "R",
      descriptor = "I"
   )
   public static int field2699;
   @OriginalMember(
      owner = "client!oc",
      name = "N",
      descriptor = "I"
   )
   public static int field2704;
   @OriginalMember(
      owner = "client!oc",
      name = "L",
      descriptor = "I"
   )
   private int field2706;
   @OriginalMember(
      owner = "client!oc",
      name = "K",
      descriptor = "I"
   )
   public static int field2710;
   @OriginalMember(
      owner = "client!oc",
      name = "I",
      descriptor = "[I"
   )
   private int[] field2709;

   @OriginalMember(
      owner = "client!oc",
      name = "j",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method1612(int arg0) {
      try {
         ++field2710;
         if (arg0 != 1) {
            method1616((byte)103);
         }

         ++class18.field210;
         class180 var1 = class486.method3603(class354.field5373, (byte)-85, class48.field583);
         var1.field2211.method1085(class694.method5042(true), (byte)-11);
         var1.field2211.method1103(class207.field2647, -116);
         var1.field2211.method1103(class411.field6305, arg0 + -128);
         var1.field2211.method1085(class261.field3566.field9435.method72(arg0 ^ 97), (byte)-11);
         class763.method5527(false, var1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2713[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "d",
      descriptor = "(B)V",
      line = 23
   )
   public final void method1613(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field2704;
         if (this.field2709 != null) {
            int var10000;
            int var10001;
            label55: {
               label54: {
                  int var3 = 0;
                  if (var2 == 0) {
                     if (var3 >= 10) {
                        break label54;
                     }

                     var10000 = this.field2709.length;
                     var10001 = this.field2706 + var3;
                     if (var2 != 0) {
                        break label55;
                     }

                     if (var10000 <= var10001) {
                        break label54;
                     }
                  }

                  do {
                     if (this.field2711[var3] == null && this.field2702.method3889(0, -123, this.field2709[this.field2706 + var3])) {
                        this.field2711[var3] = this.field2702.method3899(-44, 0, this.field2709[this.field2706 + var3]);
                     }

                     ++var3;
                     if (var3 >= 10) {
                        break;
                     }

                     var10000 = this.field2709.length;
                     var10001 = this.field2706 + var3;
                     if (var2 != 0) {
                        break label55;
                     }
                  } while(var10000 > var10001);
               }

               var10000 = arg0;
               var10001 = -98;
            }

            if (var10000 > var10001) {
               this.method1613((byte)-29);
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2713[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(IIBII)V",
      line = 61
   )
   public static final void method1614(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         if (arg2 >= -119) {
            field2705 = -99;
         }

         ++field2699;
         class403 var5 = class453.method3410((long)arg1 << 32 | (long)arg0, true, 18);
         var5.method3093(22144);
         var5.field6183 = arg4;
         var5.field6185 = arg3;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2713[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "<init>",
      descriptor = "(ILeaa;I)V",
      line = 81
   )
   public class213(int arg0, class526 arg1, int arg2) {
      super(arg0);

      try {
         this.field2702 = arg1;
         this.field2701 = arg2;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2713[6] + arg0 + ',' + (arg1 != null ? field2713[3] : field2713[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(B[B)I",
      line = 100
   )
   public final int method1615(byte arg0, byte[] arg1) throws IOException {
      int var3 = client.field4530;

      try {
         ++field2698;
         if (this.field2709 == null) {
            if (!this.field2702.method3889(0, -111, this.field2701)) {
               return 0;
            }

            byte[] var4 = this.field2702.method3899(-115, 0, this.field2701);
            if (var4 == null) {
               throw new IllegalStateException("");
            }

            this.field2712.field1590 = 0;
            this.field2712.field1552 = var4;
            int var5 = var4.length >> 1;
            this.field2709 = new int[var5];
            int var6 = 0;
            if (var3 != 0 || ~var6 > ~var5) {
               do {
                  this.field2709[var6] = this.field2712.method1038((byte)-108);
                  ++var6;
               } while(~var6 > ~var5);
            }
         }

         if (~this.field2709.length >= ~this.field2706) {
            return -1;
         } else {
            this.method1613((byte)-107);
            this.field2712.field1552 = arg1;
            this.field2712.field1590 = 0;
            if (var3 == 0 && this.field2712.field1552.length <= this.field2712.field1590) {
               this.field2712.field1552 = null;
               return arg0 < 120 ? 56 : arg1.length;
            } else {
               label102:
               do {
                  if (this.field2707.field1552 == null) {
                     if (this.field2711[0] == null) {
                        this.field2712.field1552 = null;
                        return this.field2712.field1590;
                     }

                     this.field2707.field1552 = this.field2711[0];
                  }

                  int var7 = this.field2712.field1552.length + -this.field2712.field1590;
                  int var8 = this.field2707.field1552.length - this.field2707.field1590;
                  int var10000 = ~var7;

                  do {
                     if (var10000 > ~var8) {
                        this.field2707.method1102(var7, this.field2712.field1552, this.field2712.field1590, (byte)59);
                        this.field2712.field1552 = null;
                        return arg1.length;
                     }

                     this.field2712.method1059(var8, -2125022416, this.field2707.field1552, this.field2707.field1590);
                     ++this.field2706;
                     this.field2707.field1552 = null;
                     this.field2707.field1590 = 0;
                     int var9 = 0;
                     if (var3 != 0) {
                        this.field2711[var9] = this.field2711[var9 + 1];
                        ++var9;
                     }

                     while(true) {
                        while(~var9 > -10) {
                           this.field2711[var9] = this.field2711[var9 + 1];
                           ++var9;
                        }

                        this.field2711[9] = null;
                        if (var3 == 0) {
                           if (this.field2706 < this.field2709.length) {
                              continue label102;
                           }

                           this.field2712.field1552 = null;
                           var10000 = this.field2712.field1590;
                           break;
                        }

                        this.field2711[var9] = this.field2711[var9 + 1];
                        ++var9;
                     }
                  } while(var3 != 0);

                  return var10000;
               } while(this.field2712.field1552.length > this.field2712.field1590);

               this.field2712.field1552 = null;
               if (arg0 < 120) {
                  return 56;
               } else {
                  return arg1.length;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field2713[2] + arg0 + ',' + (arg1 != null ? field2713[3] : field2713[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "e",
      descriptor = "(B)V",
      line = 205
   )
   public static void method1616(byte arg0) {
      try {
         if (arg0 > -17) {
            field2708 = true;
         }

         field2700 = null;
         field2697 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2713[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1617(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1618(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

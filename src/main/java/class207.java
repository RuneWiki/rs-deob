import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class207 {
   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "I"
   )
   private int field2637;
   @OriginalMember(
      owner = "client!km",
      name = "c",
      descriptor = "J"
   )
   private long field2634;
   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2641 = new String[]{method1713(method1712("nqcL:")), method1713(method1712("{*!\u000e")), method1713(method1712("~2c^.{69\\o")), method1713(method1712("~2c'o")), method1713(method1712("~2c%o")), method1713(method1712("~2c#o")), method1713(method1712("~2c o")), method1713(method1712("~2c&o")), method1713(method1712("~2c!o")), method1713(method1712("~2c$o"))};
   @OriginalMember(
      owner = "client!km",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2632 = null;
   @OriginalMember(
      owner = "client!km",
      name = "j",
      descriptor = "Lhv;"
   )
   public static class227 field2635 = new class227(64);
   @OriginalMember(
      owner = "client!km",
      name = "d",
      descriptor = "I"
   )
   public static int field2629;
   @OriginalMember(
      owner = "client!km",
      name = "i",
      descriptor = "I"
   )
   public static int field2631;
   @OriginalMember(
      owner = "client!km",
      name = "f",
      descriptor = "I"
   )
   public static int field2636;
   @OriginalMember(
      owner = "client!km",
      name = "g",
      descriptor = "I"
   )
   public static int field2638;
   @OriginalMember(
      owner = "client!km",
      name = "b",
      descriptor = "I"
   )
   public static int field2639;
   @OriginalMember(
      owner = "client!km",
      name = "l",
      descriptor = "I"
   )
   public static int field2640;
   @OriginalMember(
      owner = "client!km",
      name = "e",
      descriptor = "Lww;"
   )
   public static class339 field2633;
   @OriginalMember(
      owner = "client!km",
      name = "h",
      descriptor = "[Lhg;"
   )
   public static class529[] field2630;

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1705(byte arg0) {
      try {
         if (arg0 != 119) {
            method1708((byte[])null, 48, (byte[])null, -120, 117, 61, 78, 25, (byte)97);
         }

         ++field2639;
         return this.field2637;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2641[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "([SII)[S"
   )
   public static final short[] method1706(short[] arg0, int arg1, int arg2) {
      try {
         ++field2638;
         short[] var3 = new short[arg2];
         class349.method2757(arg0, 0, var3, 0, arg2);
         if (arg1 != -15450) {
            method1708((byte[])null, 69, (byte[])null, -45, -59, -111, -125, -115, (byte)92);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2641[4] + (arg0 != null ? field2641[0] : field2641[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(IB)Lah;"
   )
   public final class279 method1707(int arg0, byte arg1) {
      try {
         if (arg1 != -52) {
            this.method1705((byte)-42);
         }

         ++field2640;
         return class279.method2201(this.method1709(arg0, arg1 + 11671), (byte)-79);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2641[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "([BI[BIIIIIB)V"
   )
   public static final void method1708(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
      boolean var9 = client.field1481;

      try {
         ++field2629;
         if (arg8 != -44) {
            field2632 = null;
         }

         int var10 = -(arg5 >> 2);
         int var16 = -(3 & arg5);
         int var11 = -arg1;
         if (var9 || ~var11 > -1) {
            label88:
            do {
               int var12 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg7++;
                  arg0[var10001] = (byte)(arg0[var10001] + -arg2[arg6++]);
                  int var17 = arg7++;
                  arg0[var17] = (byte)(arg0[var17] + -arg2[arg6++]);
                  int var18 = arg7++;
                  arg0[var18] = (byte)(arg0[var18] + -arg2[arg6++]);
                  int var19 = arg7++;
                  arg0[var19] = (byte)(arg0[var19] + -arg2[arg6++]);
                  var12 = var10 + 1;
               }

               while(true) {
                  while(var12 < 0) {
                     var10001 = arg7++;
                     arg0[var10001] = (byte)(arg0[var10001] + -arg2[arg6++]);
                     var10001 = arg7++;
                     arg0[var10001] = (byte)(arg0[var10001] + -arg2[arg6++]);
                     var10001 = arg7++;
                     arg0[var10001] = (byte)(arg0[var10001] + -arg2[arg6++]);
                     var10001 = arg7++;
                     arg0[var10001] = (byte)(arg0[var10001] + -arg2[arg6++]);
                     ++var12;
                  }

                  int var13 = var16;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg7++;
                        arg0[var10001] = (byte)(arg0[var10001] + -arg2[arg6++]);
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(var13 < 0) {
                           var10001 = arg7++;
                           arg0[var10001] = (byte)(arg0[var10001] + -arg2[arg6++]);
                           ++var13;
                        }

                        arg6 += arg4;
                        arg7 += arg3;
                        if (!var9) {
                           ++var11;
                           continue label88;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            } while(~var11 > -1);

         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field2641[7] + (arg0 != null ? field2641[0] : field2641[1]) + ',' + arg1 + ',' + (arg2 != null ? field2641[0] : field2641[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method1709(int arg0, int arg1) {
      try {
         ++field2631;
         if (arg1 != 11619) {
            method1708((byte[])null, 37, (byte[])null, 32, 36, 39, -106, -10, (byte)22);
         }

         return (int)(this.field2634 >> class279.field3568 * arg0) & 15;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2641[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1710(int arg0) {
      try {
         field2635 = null;
         int var1 = -82 / ((arg0 - 7) / 58);
         field2630 = null;
         field2633 = null;
         field2632 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2641[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(Lah;I)V"
   )
   private final void method1711(class279 arg0, int arg1) {
      try {
         ++field2636;
         if (arg1 != 0) {
            field2632 = null;
         }

         this.field2634 |= (long)(arg0.field3559 << this.field2637++ * class279.field3568);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2641[3] + (arg0 != null ? field2641[0] : field2641[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "<init>",
      descriptor = "(Lah;)V"
   )
   public class207(class279 arg0) {
      try {
         this.field2637 = 1;
         this.field2634 = (long)arg0.field3559;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2641[2] + (arg0 != null ? field2641[0] : field2641[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "<init>",
      descriptor = "([Lah;)V"
   )
   public class207(class279[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1712(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1713(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

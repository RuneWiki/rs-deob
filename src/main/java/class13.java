import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ea")
public class class13 extends class16 {
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "h",
      descriptor = "Laa;"
   )
   public static class2 field99;
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "i",
      descriptor = "I"
   )
   public static int field100 = 0;
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field101;
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "k",
      descriptor = "[B"
   )
   public byte[] field102;
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "l",
      descriptor = "I"
   )
   public static int field103 = 0;
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "m",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field104 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "n",
      descriptor = "I"
   )
   public int field105;
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "o",
      descriptor = "Lr;"
   )
   public static class38 field106;
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "p",
      descriptor = "J"
   )
   public static long field107;
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "q",
      descriptor = "I"
   )
   public static int field108;
   @OriginalMember(
      owner = "loginapplet!ea",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field109;

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "b",
      descriptor = "(I)B",
      line = 9
   )
   public final byte method57(int arg0) {
      try {
         if (arg0 != -8897) {
            this.field102 = (byte[])null;
         }

         return this.field102[this.field105++];
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ea.D(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;",
      line = 31
   )
   public static final String method58(Throwable arg0, byte arg1) throws IOException {
      try {
         String var2;
         if (arg0 instanceof class1) {
            class1 var3 = (class1)arg0;
            arg0 = var3.field3;
            var2 = var3.field1 + " | ";
         } else {
            var2 = "";
         }

         StringWriter var14 = new StringWriter();
         PrintWriter var4 = new PrintWriter(var14);
         arg0.printStackTrace(var4);
         var4.close();
         String var5 = var14.toString();
         BufferedReader var6 = new BufferedReader(new StringReader(var5));
         if (arg1 < 75) {
            return (String)null;
         } else {
            String var7 = var6.readLine();

            while(true) {
               while(true) {
                  String var8 = var6.readLine();
                  if (null == var8) {
                     return var2 + "| " + var7;
                  }

                  int var9 = var8.indexOf(40);
                  int var10 = var8.indexOf(41, var9 - -1);
                  if (-1 >= ~var9 && -1 >= ~var10) {
                     String var11 = var8.substring(var9 - -1, var10);
                     int var12 = var11.indexOf(".java:");
                     if (var12 >= 0) {
                        var11 = var11.substring(0, var12) + var11.substring(5 + var12);
                        var2 = var2 + var11 + ' ';
                        continue;
                     }

                     var8 = var8.substring(0, var9);
                  }

                  var8 = var8.trim();
                  var8 = var8.substring(1 + var8.lastIndexOf(32));
                  var8 = var8.substring(1 + var8.lastIndexOf(9));
                  var2 = var2 + var8 + ' ';
               }
            }
         }
      } catch (RuntimeException var13) {
         throw var13;
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "(III[B)V",
      line = 99
   )
   public final void method59(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         if (arg1 > -43) {
            field103 = 89;
         }

         for(int var5 = arg0; ~(arg2 + arg0) < ~var5; ++var5) {
            this.field102[this.field105++] = arg3[var5];
         }

      } catch (RuntimeException var6) {
         throw class28.method139(var6, "ea.H(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "(IJ)V",
      line = 124
   )
   public final void method60(int arg0, long arg1) {
      try {
         this.field102[this.field105++] = (byte)((int)(arg1 >> -1237025096));
         this.field102[this.field105++] = (byte)((int)(arg1 >> -1702730384));
         this.field102[this.field105++] = (byte)((int)(arg1 >> 2013932072));
         this.field102[this.field105++] = (byte)((int)(arg1 >> 882204768));
         this.field102[this.field105++] = (byte)((int)(arg1 >> -1814843112));
         this.field102[this.field105++] = (byte)((int)(arg1 >> -74250992));
         this.field102[this.field105++] = (byte)((int)(arg1 >> 617241416));
         if (arg0 < 4) {
            this.method74(-121, 41);
         }

         this.field102[this.field105++] = (byte)((int)arg1);
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "ea.M(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "c",
      descriptor = "(I)I",
      line = 145
   )
   public final int method61(int arg0) {
      try {
         this.field105 += 3;
         if (arg0 != 1740634296) {
            method70(92);
         }

         return (255 & this.field102[-1 + this.field105]) + ((this.field102[-2 + this.field105] & 255) << 2106754056) + ((this.field102[-3 + this.field105] & 255) << -2142714640);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ea.I(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V",
      line = 192
   )
   public final void method62(BigInteger arg0, int arg1, BigInteger arg2) {
      try {
         if (arg1 >= -46) {
            field106 = (class38)null;
         }

         int var4 = this.field105;
         this.field105 = 0;
         byte[] var5 = new byte[var4];
         this.method75(var5, var4, -20, 0);
         BigInteger var6 = new BigInteger(var5);
         BigInteger var7 = var6.modPow(arg0, arg2);
         byte[] var8 = var7.toByteArray();
         this.field105 = 0;
         this.method74(6695, var8.length);
         this.method59(0, -88, var8.length, var8);
      } catch (RuntimeException var9) {
         throw class28.method139(var9, "ea.O(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "(I[I)V",
      line = 218
   )
   public final void method63(int arg0, int[] arg1) {
      try {
         if (arg0 > -102) {
            this.field105 = 127;
         }

         int var3 = this.field105 / 8;
         this.field105 = 0;

         for(int var4 = 0; var3 > var4; ++var4) {
            int var5 = this.method64(-1);
            int var6 = this.method64(-1);
            int var7 = -957401312;
            int var8 = -1640531527;
            int var9 = 32;

            while(-1 > ~(var9--)) {
               var6 -= (var5 >>> -1631926107 ^ var5 << 1020282724) + var5 ^ var7 - -arg1[var7 >>> 638709131 & 1333788675];
               var7 -= var8;
               var5 -= var6 + (var6 >>> 996459461 ^ var6 << -672515996) ^ arg1[var7 & 3] + var7;
            }

            this.field105 -= 8;
            this.method71(var5, 462177616);
            this.method71(var6, 462177616);
         }

      } catch (RuntimeException var10) {
         throw class28.method139(var10, "ea.Q(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "d",
      descriptor = "(I)I",
      line = 271
   )
   public final int method64(int arg0) {
      try {
         this.field105 += 4;
         if (arg0 != -1) {
            this.method60(37, -67L);
         }

         return (this.field102[-4 + this.field105] << 1990688696 & -16777216) + ((this.field102[-3 + this.field105] & 255) << 243496976) - -((255 & this.field102[this.field105 + -2]) << -1141772376) + (255 & this.field102[this.field105 + -1]);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ea.G(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "(JB)V",
      line = 286
   )
   public final void method65(long arg0, byte arg1) {
      try {
         this.field102[this.field105++] = (byte)((int)(arg0 >> 56554088));
         if (arg1 == -106) {
            this.field102[this.field105++] = (byte)((int)(arg0 >> 1931415584));
            this.field102[this.field105++] = (byte)((int)(arg0 >> -304651624));
            this.field102[this.field105++] = (byte)((int)(arg0 >> -414781296));
            this.field102[this.field105++] = (byte)((int)(arg0 >> -1386224568));
            this.field102[this.field105++] = (byte)((int)arg0);
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "ea.A(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "(Z)I",
      line = 304
   )
   public final int method66(boolean arg0) {
      try {
         return arg0 ? 35 : 255 & this.field102[this.field105++];
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ea.S(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "<init>",
      descriptor = "(I)V",
      line = 313
   )
   public class13(int arg0) {
      try {
         this.field105 = 0;
         this.field102 = class11.method47((byte)-46, arg0);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ea.<init>(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "b",
      descriptor = "(B)I",
      line = 325
   )
   public final int method67(byte arg0) {
      try {
         int var2 = -37 % ((arg0 - 53) / 41);
         this.field105 += 2;
         return (this.field102[this.field105 + -1] & 255) + (this.field102[this.field105 - 2] << -945854712 & 65280);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ea.K(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "([IIII)V",
      line = 340
   )
   public final void method68(int[] arg0, int arg1, int arg2, int arg3) {
      try {
         int var6 = (-arg3 + arg2) / 8;
         int var5 = this.field105;
         if (arg1 == 25720) {
            this.field105 = arg3;

            for(int var7 = 0; ~var7 > ~var6; ++var7) {
               int var8 = this.method64(-1);
               int var9 = this.method64(arg1 + -25721);
               int var10 = -957401312;
               int var11 = -1640531527;
               int var12 = 32;

               while(~(var12--) < -1) {
                  var9 -= arg0[-358612989 & var10 >>> -1696246357] + var10 ^ var8 + (var8 >>> 380025701 ^ var8 << 1096252484);
                  var10 -= var11;
                  var8 -= var10 + arg0[3 & var10] ^ var9 + (var9 << -2107963356 ^ var9 >>> -291204891);
               }

               this.field105 -= 8;
               this.method71(var8, 462177616);
               this.method71(var9, 462177616);
            }

            this.field105 = var5;
         }
      } catch (RuntimeException var13) {
         throw class28.method139(var13, "ea.E(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "b",
      descriptor = "(Z)V",
      line = 390
   )
   public static final void method69(boolean arg0) {
      try {
         if (!arg0) {
            if (class14.field111 != null) {
               class32 var1 = class14.field111;
               synchronized(class14.field111) {
                  class14.field111 = null;
               }
            }

         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "ea.L(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "<init>",
      descriptor = "([B)V",
      line = 406
   )
   public class13(byte[] arg0) {
      try {
         this.field105 = 0;
         this.field102 = arg0;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ea.<init>(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "e",
      descriptor = "(I)V",
      line = 418
   )
   public static void method70(int arg0) {
      try {
         field104 = null;
         field106 = null;
         field101 = null;
         field109 = null;
         field99 = null;
         if (arg0 != 32768) {
            method69(false);
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ea.C(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "(II)V",
      line = 437
   )
   public final void method71(int arg0, int arg1) {
      try {
         if (arg1 != 462177616) {
            field101 = (int[])null;
         }

         this.field102[this.field105++] = (byte)(arg0 >> 1889300344);
         this.field102[this.field105++] = (byte)(arg0 >> 462177616);
         this.field102[this.field105++] = (byte)(arg0 >> 902821320);
         this.field102[this.field105++] = (byte)arg0;
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "ea.F(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "(BJ)V",
      line = 451
   )
   public final void method72(byte arg0, long arg1) {
      try {
         this.field102[this.field105++] = (byte)((int)(arg1 >> -1309579152));
         this.field102[this.field105++] = (byte)((int)(arg1 >> 1155409704));
         this.field102[this.field105++] = (byte)((int)(arg1 >> 1311440096));
         this.field102[this.field105++] = (byte)((int)(arg1 >> -353842344));
         this.field102[this.field105++] = (byte)((int)(arg1 >> 1225286160));
         this.field102[this.field105++] = (byte)((int)(arg1 >> -958286392));
         this.field102[this.field105++] = (byte)((int)arg1);
         int var4 = 61 / ((-78 - arg0) / 37);
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "ea.J(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "f",
      descriptor = "(I)J",
      line = 476
   )
   public final long method73(int arg0) {
      try {
         long var2 = (long)this.method64(arg0 + -991986977) & 4294967295L;
         if (arg0 != 991986976) {
            field108 = -18;
         }

         long var4 = (long)this.method64(-1) & 4294967295L;
         return var4 + (var2 << 991986976);
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "ea.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "b",
      descriptor = "(II)V",
      line = 490
   )
   public final void method74(int arg0, int arg1) {
      try {
         if (arg0 == 6695) {
            this.field102[this.field105++] = (byte)arg1;
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "ea.P(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ea",
      name = "a",
      descriptor = "([BIII)V",
      line = 503
   )
   public final void method75(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         for(int var5 = arg3; ~var5 > ~(arg3 - -arg1); ++var5) {
            arg0[var5] = this.field102[this.field105++];
         }

         if (arg2 > -5) {
            field101 = (int[])null;
         }

      } catch (RuntimeException var6) {
         throw class28.method139(var6, "ea.N(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class354 extends class294 {
   @OriginalMember(
      owner = "client!ica",
      name = "F",
      descriptor = "I"
   )
   public int field5436;
   @OriginalMember(
      owner = "client!ica",
      name = "rb",
      descriptor = "[B"
   )
   public byte[] field5428;
   @OriginalMember(
      owner = "client!ica",
      name = "Hb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5440 = new String[]{method2903(method2902("e\u0000\u0007\u0012:OK")), method2903(method2902("e\u0000\u0007\u0012%NK")), method2903(method2902("e\u0000\u0007\u00120OK")), method2903(method2902("e\u0000\u0007\u0012&$")), method2903(method2902("e\u0000\u0007\u0012%MK")), method2903(method2902("b\u0016\nP")), method2903(method2902("wMH\u0012\u000f")), method2903(method2902("e\u0000\u0007\u0012<OK")), method2903(method2902("e\u0000\u0007\u0012=$")), method2903(method2902("e\u0000\u0007\u00123OK")), method2903(method2902("e\u0000\u0007\u0012#$")), method2903(method2902("e\u0000\u0007\u0012\"NK")), method2903(method2902("e\u0000\u0007\u0012 $")), method2903(method2902(",NF_\u0013b\r\tHR|\t\u0015H\u0000")), method2903(method2902("B6*\u001c\u0011d\u0002\u0014]\u0011x\u0006\u0014\u001c\u0013xC")), method2903(method2902("e\u0000\u0007\u0012:NK")), method2903(method2902("e\u0000\u0007\u00121MK")), method2903(method2902("e\u0000\u0007\u0012 NK")), method2903(method2902("e\u0000\u0007\u00127MK")), method2903(method2902("e\u0000\u0007\u0012#OK")), method2903(method2902("e\u0000\u0007\u0012'MK")), method2903(method2902("e\u0000\u0007\u0012;NK")), method2903(method2902("e\u0000\u0007\u00123NK")), method2903(method2902("e\u0000\u0007\u00129OK")), method2903(method2902("e\u0000\u0007\u0012;OK")), method2903(method2902("e\u0000\u0007\u0012!NK")), method2903(method2902("e\u0000\u0007\u00129MK")), method2903(method2902("e\u0000\u0007\u00123MK")), method2903(method2902("e\u0000\u0007\u0012:MK")), method2903(method2902("e\u0000\u0007\u0012>NK")), method2903(method2902("e\u0000\u0007\u0012'$")), method2903(method2902("e\u0000\u0007\u00126MK")), method2903(method2902("e\u0000\u0007\u0012?OK")), method2903(method2902("e\u0000\u0007\u0012=MK")), method2903(method2902("e\u0000\u0007\u0012&NK")), method2903(method2902("e\u0000\u0007\u0012Ne\r\u000fHL$")), method2903(method2902("e\u0000\u0007\u00129NK")), method2903(method2902("e\u0000\u0007\u00127OK")), method2903(method2902("e\u0000\u0007\u00121OK")), method2903(method2902("e\u0000\u0007\u0012!MK")), method2903(method2902(",NF_\u0013b\r\tHR|\t\u0015H\u0000>")), method2903(method2902("e\u0000\u0007\u0012=OK")), method2903(method2902("N\u0002\u0002\u001c\u0004i\u0011\u0015U\u001dbC\bI\u001fn\u0006\u0014\u001c\u001bbC\u0001V\u0001x\u0011T")), method2903(method2902("e\u0000\u0007\u0012=NK")), method2903(method2902("e\u0000\u0007\u0012#MK")), method2903(method2902("e\u0000\u0007\u0012\"$")), method2903(method2902("e\u0000\u0007\u0012\"OK")), method2903(method2902("e\u0000\u0007\u00120MK")), method2903(method2902("e\u0000\u0007\u00128NK")), method2903(method2902("e\u0000\u0007\u0012<NK")), method2903(method2902("e\u0000\u0007\u0012$NK")), method2903(method2902("e\u0000\u0007\u0012&MK")), method2903(method2902("e\u0000\u0007\u00128MK")), method2903(method2902("e\u0000\u0007\u0012'NK")), method2903(method2902("e\u0000\u0007\u0012%$")), method2903(method2902("e\u0000\u0007\u00125OK")), method2903(method2902("e\u0000\u0007\u00126OK")), method2903(method2902("e\u0000\u0007\u0012#NK")), method2903(method2902("e\u0000\u0007\u0012\"MK")), method2903(method2902("e\u0000\u0007\u0012;MK")), method2903(method2902("e\u0000\u0007\u0012 MK")), method2903(method2902("e\u0000\u0007\u0012>OK")), method2903(method2902("e\u0000\u0007\u0012>MK")), method2903(method2902("e\u0000\u0007\u0012$$")), method2903(method2902("e\u0000\u0007\u00124OK")), method2903(method2902("e\u0000\u0007\u0012?MK")), method2903(method2902("e\u0000\u0007\u00125MK")), method2903(method2902("e\u0000\u0007\u00124MK")), method2903(method2902("e\u0000\u0007\u0012!$")), method2903(method2902("e\u0000\u0007\u00128OK")), method2903(method2902("e\u0000\u0007\u00124NK")), method2903(method2902("e\u0000\u0007\u0012<MK")), method2903(method2902("e\u0000\u0007\u00125NK")), method2903(method2902("e\u0000\u0007\u0012?NK")), method2903(method2902("e\u0000\u0007\u0012$MK"))};
   @OriginalMember(
      owner = "client!ica",
      name = "E",
      descriptor = "[Lkc;"
   )
   public static class132[] field5426 = new class132[75];
   @OriginalMember(
      owner = "client!ica",
      name = "A",
      descriptor = "I"
   )
   public static int field5367;
   @OriginalMember(
      owner = "client!ica",
      name = "T",
      descriptor = "I"
   )
   public static int field5368;
   @OriginalMember(
      owner = "client!ica",
      name = "M",
      descriptor = "I"
   )
   public static int field5369;
   @OriginalMember(
      owner = "client!ica",
      name = "R",
      descriptor = "I"
   )
   public static int field5370;
   @OriginalMember(
      owner = "client!ica",
      name = "Gb",
      descriptor = "I"
   )
   public static int field5371;
   @OriginalMember(
      owner = "client!ica",
      name = "N",
      descriptor = "I"
   )
   public static int field5372;
   @OriginalMember(
      owner = "client!ica",
      name = "kb",
      descriptor = "I"
   )
   public static int field5373;
   @OriginalMember(
      owner = "client!ica",
      name = "Z",
      descriptor = "I"
   )
   public static int field5374;
   @OriginalMember(
      owner = "client!ica",
      name = "W",
      descriptor = "I"
   )
   public static int field5375;
   @OriginalMember(
      owner = "client!ica",
      name = "J",
      descriptor = "I"
   )
   public static int field5376;
   @OriginalMember(
      owner = "client!ica",
      name = "ib",
      descriptor = "I"
   )
   public static int field5377;
   @OriginalMember(
      owner = "client!ica",
      name = "q",
      descriptor = "I"
   )
   public static int field5378;
   @OriginalMember(
      owner = "client!ica",
      name = "o",
      descriptor = "I"
   )
   public static int field5379;
   @OriginalMember(
      owner = "client!ica",
      name = "zb",
      descriptor = "I"
   )
   public static int field5380;
   @OriginalMember(
      owner = "client!ica",
      name = "u",
      descriptor = "I"
   )
   public static int field5381;
   @OriginalMember(
      owner = "client!ica",
      name = "pb",
      descriptor = "I"
   )
   public static int field5382;
   @OriginalMember(
      owner = "client!ica",
      name = "bb",
      descriptor = "I"
   )
   public static int field5383;
   @OriginalMember(
      owner = "client!ica",
      name = "ab",
      descriptor = "I"
   )
   public static int field5384;
   @OriginalMember(
      owner = "client!ica",
      name = "hb",
      descriptor = "I"
   )
   public static int field5385;
   @OriginalMember(
      owner = "client!ica",
      name = "y",
      descriptor = "I"
   )
   public static int field5386;
   @OriginalMember(
      owner = "client!ica",
      name = "Cb",
      descriptor = "I"
   )
   public static int field5387;
   @OriginalMember(
      owner = "client!ica",
      name = "L",
      descriptor = "I"
   )
   public static int field5388;
   @OriginalMember(
      owner = "client!ica",
      name = "D",
      descriptor = "I"
   )
   public static int field5389;
   @OriginalMember(
      owner = "client!ica",
      name = "Bb",
      descriptor = "I"
   )
   public static int field5390;
   @OriginalMember(
      owner = "client!ica",
      name = "w",
      descriptor = "I"
   )
   public static int field5391;
   @OriginalMember(
      owner = "client!ica",
      name = "eb",
      descriptor = "I"
   )
   public static int field5392;
   @OriginalMember(
      owner = "client!ica",
      name = "vb",
      descriptor = "I"
   )
   public static int field5393;
   @OriginalMember(
      owner = "client!ica",
      name = "U",
      descriptor = "I"
   )
   public static int field5394;
   @OriginalMember(
      owner = "client!ica",
      name = "B",
      descriptor = "I"
   )
   public static int field5395;
   @OriginalMember(
      owner = "client!ica",
      name = "Q",
      descriptor = "I"
   )
   public static int field5396;
   @OriginalMember(
      owner = "client!ica",
      name = "t",
      descriptor = "I"
   )
   public static int field5397;
   @OriginalMember(
      owner = "client!ica",
      name = "Fb",
      descriptor = "I"
   )
   public static int field5398;
   @OriginalMember(
      owner = "client!ica",
      name = "x",
      descriptor = "I"
   )
   public static int field5399;
   @OriginalMember(
      owner = "client!ica",
      name = "fb",
      descriptor = "I"
   )
   public static int field5401;
   @OriginalMember(
      owner = "client!ica",
      name = "V",
      descriptor = "I"
   )
   public static int field5402;
   @OriginalMember(
      owner = "client!ica",
      name = "qb",
      descriptor = "I"
   )
   public static int field5403;
   @OriginalMember(
      owner = "client!ica",
      name = "Y",
      descriptor = "I"
   )
   public static int field5404;
   @OriginalMember(
      owner = "client!ica",
      name = "v",
      descriptor = "I"
   )
   public static int field5405;
   @OriginalMember(
      owner = "client!ica",
      name = "G",
      descriptor = "I"
   )
   public static int field5406;
   @OriginalMember(
      owner = "client!ica",
      name = "jb",
      descriptor = "I"
   )
   public static int field5407;
   @OriginalMember(
      owner = "client!ica",
      name = "lb",
      descriptor = "I"
   )
   public static int field5408;
   @OriginalMember(
      owner = "client!ica",
      name = "cb",
      descriptor = "I"
   )
   public static int field5409;
   @OriginalMember(
      owner = "client!ica",
      name = "ub",
      descriptor = "I"
   )
   public static int field5410;
   @OriginalMember(
      owner = "client!ica",
      name = "m",
      descriptor = "I"
   )
   public static int field5411;
   @OriginalMember(
      owner = "client!ica",
      name = "X",
      descriptor = "I"
   )
   public static int field5412;
   @OriginalMember(
      owner = "client!ica",
      name = "ob",
      descriptor = "I"
   )
   public static int field5413;
   @OriginalMember(
      owner = "client!ica",
      name = "Eb",
      descriptor = "I"
   )
   public static int field5414;
   @OriginalMember(
      owner = "client!ica",
      name = "sb",
      descriptor = "I"
   )
   public static int field5415;
   @OriginalMember(
      owner = "client!ica",
      name = "K",
      descriptor = "I"
   )
   public static int field5416;
   @OriginalMember(
      owner = "client!ica",
      name = "Db",
      descriptor = "I"
   )
   public static int field5417;
   @OriginalMember(
      owner = "client!ica",
      name = "nb",
      descriptor = "I"
   )
   public static int field5418;
   @OriginalMember(
      owner = "client!ica",
      name = "xb",
      descriptor = "I"
   )
   public static int field5419;
   @OriginalMember(
      owner = "client!ica",
      name = "P",
      descriptor = "I"
   )
   public static int field5420;
   @OriginalMember(
      owner = "client!ica",
      name = "gb",
      descriptor = "I"
   )
   public static int field5421;
   @OriginalMember(
      owner = "client!ica",
      name = "yb",
      descriptor = "I"
   )
   public static int field5422;
   @OriginalMember(
      owner = "client!ica",
      name = "s",
      descriptor = "I"
   )
   public static int field5423;
   @OriginalMember(
      owner = "client!ica",
      name = "tb",
      descriptor = "I"
   )
   public static int field5424;
   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "I"
   )
   public static int field5425;
   @OriginalMember(
      owner = "client!ica",
      name = "Ab",
      descriptor = "I"
   )
   public static int field5427;
   @OriginalMember(
      owner = "client!ica",
      name = "mb",
      descriptor = "I"
   )
   public static int field5429;
   @OriginalMember(
      owner = "client!ica",
      name = "r",
      descriptor = "I"
   )
   public static int field5430;
   @OriginalMember(
      owner = "client!ica",
      name = "p",
      descriptor = "I"
   )
   public static int field5431;
   @OriginalMember(
      owner = "client!ica",
      name = "db",
      descriptor = "I"
   )
   public static int field5432;
   @OriginalMember(
      owner = "client!ica",
      name = "C",
      descriptor = "I"
   )
   public static int field5433;
   @OriginalMember(
      owner = "client!ica",
      name = "n",
      descriptor = "I"
   )
   public static int field5434;
   @OriginalMember(
      owner = "client!ica",
      name = "S",
      descriptor = "I"
   )
   public static int field5435;
   @OriginalMember(
      owner = "client!ica",
      name = "O",
      descriptor = "I"
   )
   public static int field5437;
   @OriginalMember(
      owner = "client!ica",
      name = "I",
      descriptor = "I"
   )
   public static int field5438;
   @OriginalMember(
      owner = "client!ica",
      name = "wb",
      descriptor = "I"
   )
   public static int field5439;
   @OriginalMember(
      owner = "client!ica",
      name = "H",
      descriptor = "Lgg;"
   )
   public static class429 field5400;

   @OriginalMember(
      owner = "client!ica",
      name = "v",
      descriptor = "(I)I",
      line = 4
   )
   public final int method2834(int arg0) {
      try {
         ++field5367;
         this.field5436 += 2;
         if (arg0 != 7183) {
            this.method2883(-23, -92);
         }

         return (this.field5428[this.field5436 + -2] << 8 & 65280) + (this.field5428[this.field5436 + -1] + -128 & 255);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V",
      line = 20
   )
   public final void method2835(boolean arg0, String arg1) {
      try {
         ++field5404;
         int var3 = arg1.indexOf(0);
         if (~var3 <= -1) {
            throw new IllegalArgumentException(field5440[14] + var3 + field5440[40]);
         } else {
            this.field5428[this.field5436++] = 0;
            this.field5436 += class382.method3104(arg1.length(), this.field5436, 320, arg1, this.field5428, 0);
            this.field5428[this.field5436++] = 0;
            if (arg0) {
               this.method2846(21, 58);
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[39] + arg0 + ',' + (arg1 != null ? field5440[6] : field5440[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "o",
      descriptor = "(I)J",
      line = 49
   )
   public final long method2836(int arg0) {
      try {
         ++field5403;
         long var2 = 4294967295L & (long)this.method2839((byte)-20);
         long var4 = 4294967295L & (long)this.method2839((byte)-20);
         int var6 = 95 / ((60 - arg0) / 46);
         return (var4 << 32) + var2;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field5440[38] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "f",
      descriptor = "(B)B",
      line = 64
   )
   public final byte method2837(byte arg0) {
      try {
         if (arg0 >= -86) {
            field5405 = -120;
         }

         ++field5379;
         return (byte)(this.field5428[this.field5436++] + -128);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "g",
      descriptor = "(II)V",
      line = 75
   )
   public final void method2838(int arg0, int arg1) {
      try {
         int var3 = -67 % ((arg1 - -48) / 52);
         this.field5428[this.field5436++] = (byte)(arg0 >> 8);
         ++field5410;
         this.field5428[this.field5436++] = (byte)arg0;
         this.field5428[this.field5436++] = (byte)(arg0 >> 24);
         this.field5428[this.field5436++] = (byte)(arg0 >> 16);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[50] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "d",
      descriptor = "(B)I",
      line = 91
   )
   public final int method2839(byte arg0) {
      try {
         ++field5374;
         this.field5436 += 4;
         return arg0 != -20 ? -33 : ((this.field5428[this.field5436 - 1] & 255) << 24) + (255 & this.field5428[this.field5436 + -4]) + ((255 & this.field5428[this.field5436 + -3]) << 8) + (16711680 & this.field5428[this.field5436 + -2] << 16);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "l",
      descriptor = "(II)V",
      line = 108
   )
   public final void method2840(int arg0, int arg1) {
      try {
         ++field5411;
         this.field5428[this.field5436++] = (byte)arg1;
         this.field5428[this.field5436++] = (byte)(arg1 >> 8);
         this.field5428[this.field5436++] = (byte)(arg1 >> 16);
         this.field5428[this.field5436++] = (byte)(arg1 >> 24);
         if (arg0 <= 47) {
            this.field5436 = 81;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[28] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "k",
      descriptor = "(II)V",
      line = 123
   )
   public final void method2841(int arg0, int arg1) {
      try {
         ++field5382;
         this.field5428[this.field5436++] = (byte)arg1;
         this.field5428[this.field5436++] = (byte)(arg1 >> 8);
         if (arg0 != -3) {
            this.method2901(38, -83);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[33] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "(Z)I",
      line = 137
   )
   public final int method2842(boolean arg0) {
      try {
         this.field5436 += 4;
         if (!arg0) {
            return 81;
         } else {
            ++field5394;
            return (255 & this.field5428[this.field5436 - 4]) + (this.field5428[this.field5436 - 1] << 24 & -16777216) + ((255 & this.field5428[this.field5436 + -3]) << 8) + (this.field5428[this.field5436 + -2] << 16 & 16711680);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[65] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "t",
      descriptor = "(I)Ljava/lang/String;",
      line = 151
   )
   public final String method2843(int arg0) {
      try {
         ++field5429;
         int var2 = this.field5436;

         while(~this.field5428[this.field5436++] != -1) {
         }

         int var3 = -var2 + this.field5436 + arg0;
         return var3 == 0 ? "" : class45.method326(var3, true, this.field5428, var2);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[49] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(II[II)V",
      line = 170
   )
   public final void method2844(int arg0, int arg1, int[] arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         ++field5402;
         int var6 = this.field5436;
         this.field5436 = arg1;
         int var7 = (-arg1 + arg0) / 8;
         int var8 = 0;
         int var10000;
         if (var5) {
            var10000 = this.method2894(109);
         } else if (var8 >= var7) {
            this.field5436 = var6;
            var10000 = arg3;
            if (!var5) {
               if (arg3 != 1) {
                  this.method2842(true);
                  return;
               }

               return;
            }
         } else {
            var10000 = this.method2894(109);
         }

         while(true) {
            int var9 = var10000;
            int var10 = this.method2894(99);
            int var11 = 0;
            int var12 = -1640531527;
            int var13 = 32;
            if (var5) {
               var9 += (var10 >>> 5 ^ var10 << 4) + var10 ^ arg2[var11 & 3] + var11;
               var11 += var12;
               var10 += arg2[var11 >>> 11 & 1059061763] + var11 ^ (var9 << 4 ^ var9 >>> 5) + var9;
            }

            while(true) {
               while(~(var13--) < -1) {
                  var9 += (var10 >>> 5 ^ var10 << 4) + var10 ^ arg2[var11 & 3] + var11;
                  var11 += var12;
                  var10 += arg2[var11 >>> 11 & 1059061763] + var11 ^ (var9 << 4 ^ var9 >>> 5) + var9;
               }

               this.field5436 -= 8;
               this.method2849(var9, (byte)-34);
               this.method2849(var10, (byte)-34);
               if (!var5) {
                  ++var8;
                  if (var8 >= var7) {
                     this.field5436 = var6;
                     var10000 = arg3;
                     if (!var5) {
                        if (arg3 != 1) {
                           this.method2842(true);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = this.method2894(109);
                  }
                  break;
               }

               var10 += arg2[var11 >>> 11 & 1059061763] + var11 ^ (var9 << 4 ^ var9 >>> 5) + var9;
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field5440[54] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5440[6] : field5440[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(I)I",
      line = 214
   )
   public final int method2845(int arg0) {
      try {
         ++field5438;
         this.field5436 += 3;
         int var2 = 120 % ((arg0 - 84) / 41);
         int var3 = (this.field5428[this.field5436 - 1] & 255) + ((this.field5428[this.field5436 + -2] & 255) << 8) + (this.field5428[this.field5436 + -3] << 16 & 16711680);
         if (~var3 < -8388608) {
            var3 -= 16777216;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "i",
      descriptor = "(II)V",
      line = 230
   )
   public final void method2846(int arg0, int arg1) {
      try {
         ++field5435;
         this.field5428[-arg1 + -1 + this.field5436] = (byte)arg1;
         if (arg0 != 15160) {
            field5426 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "j",
      descriptor = "(I)Ljava/lang/String;",
      line = 244
   )
   public final String method2847(int arg0) {
      try {
         ++field5408;
         byte var2 = this.field5428[this.field5436++];
         if (var2 != 0) {
            throw new IllegalStateException(field5440[42]);
         } else {
            int var3 = this.field5436;

            while(this.field5428[this.field5436++] != 0) {
            }

            int var4 = this.field5436 - var3 - arg0;
            return var4 == 0 ? "" : class45.method326(var4, true, this.field5428, var3);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5440[41] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "h",
      descriptor = "(I)I",
      line = 270
   )
   public final int method2848(int arg0) {
      try {
         this.field5436 += 2;
         ++field5432;
         if (arg0 >= -91) {
            field5389 = 23;
         }

         return ((255 & this.field5428[this.field5436 - 2]) << 8) + (255 & this.field5428[this.field5436 + -1]);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[73] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(IB)V",
      line = 283
   )
   public final void method2849(int arg0, byte arg1) {
      try {
         ++field5380;
         if (arg1 != -34) {
            field5389 = 106;
         }

         this.field5428[this.field5436++] = (byte)(arg0 >> 24);
         this.field5428[this.field5436++] = (byte)(arg0 >> 16);
         this.field5428[this.field5436++] = (byte)(arg0 >> 8);
         this.field5428[this.field5436++] = (byte)arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[20] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "g",
      descriptor = "(B)I",
      line = 297
   )
   public final int method2850(byte arg0) {
      try {
         ++field5385;
         if (this.field5428[this.field5436] < 0) {
            return this.method2894(125) & Integer.MAX_VALUE;
         } else {
            int var2 = this.method2848(-111);
            if (arg0 != -98) {
               this.method2899((byte[])null, -85, 113, -113);
            }

            return ~var2 == -32768 ? -1 : var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[74] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "(I)J",
      line = 324
   )
   public final long method2851(int arg0) {
      try {
         ++field5416;
         long var2 = (long)this.method2855(arg0 + 1575204737) & 4294967295L;
         long var4 = 4294967295L & (long)this.method2894(arg0 + 1575235859);
         if (arg0 != -1575235744) {
            field5405 = -110;
         }

         return (var2 << 32) + var4;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5440[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(B)B",
      line = 339
   )
   public final byte method2852(byte arg0) {
      try {
         if (arg0 != 48) {
            this.method2864(-67, 52);
         }

         ++field5386;
         return (byte)(-this.field5428[this.field5436++]);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(ZI)V",
      line = 350
   )
   public final void method2853(boolean arg0, int arg1) {
      try {
         if (arg0) {
            this.method2843(-63);
         }

         ++field5422;
         this.field5428[this.field5436++] = (byte)arg1;
         this.field5428[this.field5436++] = (byte)(arg1 >> 8);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[66] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "h",
      descriptor = "(B)V",
      line = 365
   )
   public static void method2854(byte arg0) {
      try {
         field5400 = null;
         if (arg0 == 112) {
            field5426 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5440[68] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "k",
      descriptor = "(I)I",
      line = 376
   )
   public final int method2855(int arg0) {
      try {
         ++field5399;
         if (arg0 != -31007) {
            field5389 = -75;
         }

         return this.field5428[this.field5436++] & 255;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[63] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "f",
      descriptor = "(II)V",
      line = 388
   )
   public final void method2856(int arg0, int arg1) {
      try {
         this.field5428[this.field5436++] = (byte)(arg1 - -128);
         ++field5424;
         int var3 = 48 % ((-6 - arg0) / 43);
         this.field5428[this.field5436++] = (byte)(arg1 >> 8);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[60] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "k",
      descriptor = "(B)I",
      line = 399
   )
   public final int method2857(byte arg0) {
      try {
         ++field5409;
         return arg0 < 115 ? -128 : 128 + -this.field5428[this.field5436++] & 255;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[46] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(III[B)V",
      line = 414
   )
   public final void method2858(int param1, int param2, int param3, byte[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "([BIZI)V",
      line = 433
   )
   public final void method2859(byte[] arg0, int arg1, boolean arg2, int arg3) {
      try {
         ++field5391;

         for(int var5 = arg1; ~var5 > ~(arg1 + arg3); ++var5) {
            arg0[var5] = this.field5428[this.field5436++];
         }

         if (arg2) {
            this.method2889(false);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5440[17] + (arg0 != null ? field5440[6] : field5440[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "c",
      descriptor = "(Z)I",
      line = 458
   )
   public final int method2860(boolean arg0) {
      try {
         if (!arg0) {
            return -102;
         } else {
            this.field5436 += 4;
            ++field5384;
            return (-16777216 & this.field5428[this.field5436 + -2] << 24) - -((255 & this.field5428[this.field5436 - 4]) << 8) + (this.field5428[this.field5436 + -1] << 16 & 16711680) + (255 & this.field5428[this.field5436 + -3]);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "(B)I",
      line = 471
   )
   public final int method2861(byte arg0) {
      try {
         ++field5381;
         this.field5436 += 2;
         if (arg0 <= 41) {
            field5426 = null;
         }

         return (65280 & this.field5428[this.field5436 - 1] << 8) - -(255 & this.field5428[this.field5436 + -2]);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[70] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)V",
      line = 484
   )
   public final void method2862(String arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method2882((byte)-12, 26);
         }

         ++field5396;
         int var3 = arg0.indexOf(0);
         if (~var3 <= -1) {
            throw new IllegalArgumentException(field5440[14] + var3 + field5440[13]);
         } else {
            this.field5436 += class382.method3104(arg0.length(), this.field5436, 320, arg0, this.field5428, 0);
            this.field5428[this.field5436++] = 0;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[12] + (arg0 != null ? field5440[6] : field5440[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(II)V",
      line = 504
   )
   public final void method2863(int arg0, int arg1) {
      try {
         this.field5428[this.field5436 - 4 + -arg0] = (byte)(arg0 >> 24);
         ++field5369;
         this.field5428[this.field5436 - arg0 + arg1] = (byte)(arg0 >> 16);
         this.field5428[-arg0 + this.field5436 + -2] = (byte)(arg0 >> 8);
         this.field5428[-arg0 + this.field5436 - 1] = (byte)arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[71] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "e",
      descriptor = "(II)V",
      line = 519
   )
   public final void method2864(int arg0, int arg1) {
      try {
         this.field5428[this.field5436++] = (byte)arg1;
         if (arg0 != -26110) {
            field5405 = 4;
         }

         ++field5387;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "c",
      descriptor = "(B)I",
      line = 530
   )
   public final int method2865(byte arg0) {
      try {
         this.field5436 += 2;
         ++field5437;
         int var2 = ((255 & this.field5428[this.field5436 + -2]) << 8) + (255 & this.field5428[this.field5436 - 1] + -128);
         if (arg0 != -9) {
            this.method2869(false);
         }

         if (var2 > 32767) {
            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(IZ)V",
      line = 547
   )
   public final void method2866(int arg0, boolean arg1) {
      try {
         this.field5428[this.field5436++] = (byte)(arg0 >> 16);
         ++field5431;
         this.field5428[this.field5436++] = (byte)(arg0 >> 24);
         this.field5428[this.field5436++] = (byte)arg0;
         if (arg1) {
            this.field5428[this.field5436++] = (byte)(arg0 >> 8);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[23] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "p",
      descriptor = "(I)I",
      line = 563
   )
   public final int method2867(int arg0) {
      try {
         if (arg0 < 8) {
            this.field5428 = null;
         }

         this.field5436 += 2;
         ++field5398;
         return ((255 & this.field5428[this.field5436 - 1]) << 8) + (255 & this.field5428[this.field5436 - 2] + -128);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[62] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "n",
      descriptor = "(I)I",
      line = 575
   )
   public final int method2868(int arg0) {
      try {
         ++field5412;
         if (arg0 != 1318266360) {
            this.method2835(true, (String)null);
         }

         return 255 & -this.field5428[this.field5436++];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "d",
      descriptor = "(Z)I",
      line = 586
   )
   public final int method2869(boolean arg0) {
      try {
         ++field5423;
         if (arg0) {
            this.field5436 = 7;
         }

         this.field5436 += 2;
         int var2 = ((255 & this.field5428[this.field5436 - 2]) << 8) + (255 & this.field5428[this.field5436 - 1]);
         if (~var2 < -32768) {
            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[72] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "(II)V",
      line = 604
   )
   public final void method2870(int arg0, int arg1) {
      try {
         if (arg0 != -32768) {
            this.method2901(-98, -70);
         }

         ++field5397;
         this.field5428[this.field5436++] = (byte)(arg1 + 128);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[52] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(I[I)V",
      line = 615
   )
   public final void method2871(int arg0, int[] arg1) {
      boolean var3 = client.field1786;

      try {
         ++field5421;
         int var4 = this.field5436 / 8;
         this.field5436 = 0;
         int var5 = 0;
         int var10000;
         if (var3) {
            var10000 = this.method2894(126);
         } else if (var5 >= var4) {
            var10000 = arg0;
            if (!var3) {
               if (arg0 != -4303) {
                  field5389 = -32;
                  return;
               }

               return;
            }
         } else {
            var10000 = this.method2894(126);
         }

         while(true) {
            int var6 = var10000;
            int var7 = this.method2894(112);
            int var8 = -957401312;
            int var9 = -1640531527;
            int var10 = 32;
            if (var3) {
               var7 -= arg1[1321205763 & var8 >>> 11] + var8 ^ (var6 >>> 5 ^ var6 << 4) + var6;
               var8 -= var9;
               var6 -= arg1[3 & var8] + var8 ^ (var7 << 4 ^ var7 >>> 5) - -var7;
            }

            while(true) {
               while(var10-- > 0) {
                  var7 -= arg1[1321205763 & var8 >>> 11] + var8 ^ (var6 >>> 5 ^ var6 << 4) + var6;
                  var8 -= var9;
                  var6 -= arg1[3 & var8] + var8 ^ (var7 << 4 ^ var7 >>> 5) - -var7;
               }

               this.field5436 -= 8;
               this.method2849(var6, (byte)-34);
               this.method2849(var7, (byte)-34);
               if (!var3) {
                  ++var5;
                  if (var5 >= var4) {
                     var10000 = arg0;
                     if (!var3) {
                        if (arg0 != -4303) {
                           field5389 = -32;
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = this.method2894(126);
                  }
                  break;
               }

               var6 -= arg1[3 & var8] + var8 ^ (var7 << 4 ^ var7 >>> 5) - -var7;
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field5440[30] + arg0 + ',' + (arg1 != null ? field5440[6] : field5440[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "m",
      descriptor = "(I)I",
      line = 663
   )
   public final int method2872(int arg0) {
      try {
         this.field5436 += 3;
         ++field5434;
         return arg0 != 2 ? 116 : (this.field5428[this.field5436 + -3] << 16 & 16711680) + ((255 & this.field5428[this.field5436 + -2]) << 8) + (255 & this.field5428[this.field5436 + -1]);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[48] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "(IB)V",
      line = 676
   )
   public final void method2873(int arg0, byte arg1) {
      try {
         this.field5428[this.field5436++] = (byte)(arg0 >> 8);
         ++field5418;
         this.field5428[this.field5436++] = (byte)arg0;
         int var3 = -105 % ((36 - arg1) / 53);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[27] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "c",
      descriptor = "(BI)V",
      line = 688
   )
   public final void method2874(byte arg0, int arg1) {
      try {
         ++field5392;
         this.field5428[this.field5436++] = (byte)(arg1 >> 8);
         if (arg0 != -23) {
            field5400 = null;
         }

         this.field5428[this.field5436++] = (byte)(arg1 + 128);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[31] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "r",
      descriptor = "(I)Z",
      line = 700
   )
   public final boolean method2875(int arg0) {
      try {
         this.field5436 -= 4;
         ++field5372;
         int var2 = class180.method1632(2, 0, this.field5436, this.field5428);
         int var3 = this.method2894(113);
         int var4 = -116 / ((arg0 - -64) / 38);
         return ~var2 == ~var3;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5440[64] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "u",
      descriptor = "(I)Ljava/lang/String;",
      line = 719
   )
   public final String method2876(int arg0) {
      try {
         ++field5393;
         if (~this.field5428[this.field5436] == -1) {
            ++this.field5436;
            return null;
         } else {
            if (arg0 < 45) {
               this.method2845(77);
            }

            return this.method2843(-1);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "s",
      descriptor = "(I)I",
      line = 743
   )
   public final int method2877(int arg0) {
      try {
         if (arg0 != -31130) {
            this.method2883(-11, 121);
         }

         ++field5373;
         return this.field5428[this.field5436++] - 128 & 255;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V",
      line = 762
   )
   public final void method2878(byte arg0, BigInteger arg1, BigInteger arg2) {
      try {
         ++field5395;
         int var4 = this.field5436;
         this.field5436 = 0;
         byte[] var5 = new byte[var4];
         this.method2859(var5, 0, false, var4);
         BigInteger var6 = new BigInteger(var5);
         BigInteger var7 = var6.modPow(arg1, arg2);
         byte[] var8 = var7.toByteArray();
         this.field5436 = 0;
         this.method2873(var8.length, (byte)94);
         this.method2858(var8.length, 427497672, 0, var8);
         if (arg0 < 121) {
            this.method2845(29);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field5440[56] + arg0 + ',' + (arg1 != null ? field5440[6] : field5440[5]) + ',' + (arg2 != null ? field5440[6] : field5440[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "i",
      descriptor = "(I)V",
      line = 790
   )
   public final void method2879(int arg0) {
      try {
         if (arg0 != 1) {
            this.field5428 = null;
         }

         if (this.field5428 != null) {
            class56.method417((byte)36, this.field5428);
         }

         ++field5401;
         this.field5428 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "e",
      descriptor = "(B)I",
      line = 805
   )
   public final int method2880(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field5371;
         int var3 = 0;
         if (arg0 != -74) {
            return 115;
         } else {
            int var4 = this.method2896(0);
            if (var2) {
               var4 = this.method2896(0);
               var3 += 32767;
            }

            while(true) {
               while(var4 == 32767) {
                  var4 = this.method2896(0);
                  var3 += 32767;
               }

               var3 += var4;
               if (!var2) {
                  return var3;
               }

               var4 = var3;
               var3 += 32767;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5440[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "w",
      descriptor = "(I)I",
      line = 827
   )
   public final int method2881(int arg0) {
      try {
         ++field5370;
         int var2 = 106 / ((-8 - arg0) / 35);
         int var3 = 255 & this.field5428[this.field5436];
         return ~var3 > -129 ? this.method2855(-31007) - 64 : -49152 + this.method2848(-98);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "d",
      descriptor = "(BI)V",
      line = 848
   )
   public final void method2882(byte arg0, int arg1) {
      try {
         ++field5425;
         this.field5428[-arg1 + -2 + this.field5436] = (byte)(arg1 >> 8);
         if (arg0 < 12) {
            this.method2838(-62, 27);
         }

         this.field5428[this.field5436 + -1 + -arg1] = (byte)arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[25] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "j",
      descriptor = "(II)V",
      line = 861
   )
   public final void method2883(int arg0, int arg1) {
      try {
         ++field5420;
         if (~arg0 <= -1 && ~arg0 > -129) {
            this.method2864(-26110, arg0);
         } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2873(32768 - -arg0, (byte)92);
         } else {
            int var3 = -42 / ((-42 - arg1) / 45);
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[26] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(BI)V",
      line = 885
   )
   public final void method2884(byte arg0, int arg1) {
      try {
         ++field5378;
         if (~(-128 & arg1) != -1) {
            if (~(arg1 & -16384) != -1) {
               if ((-2097152 & arg1) != 0) {
                  if ((-268435456 & arg1) != 0) {
                     this.method2864(-26110, arg1 >>> 28 | 128);
                  }

                  this.method2864(-26110, (arg1 | 268921470) >>> 21);
               }

               this.method2864(-26110, arg1 >>> 14 | 128);
            }

            this.method2864(-26110, arg1 >>> 7 | 128);
         }

         if (arg0 == -109) {
            this.method2864(arg0 ^ 26001, 127 & arg1);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "j",
      descriptor = "(B)I",
      line = 916
   )
   public final int method2885(byte arg0) {
      try {
         ++field5427;
         this.field5436 += 4;
         int var2 = -36 % ((arg0 - 10) / 34);
         return ((this.field5428[this.field5436 + -1] & 255) << 8) + (16711680 & this.field5428[this.field5436 + -4] << 16) + (this.field5428[this.field5436 + -3] << 24 & -16777216) - -(255 & this.field5428[this.field5436 + -2]);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "i",
      descriptor = "(B)B",
      line = 928
   )
   public final byte method2886(byte arg0) {
      try {
         if (arg0 != 88) {
            this.field5428 = null;
         }

         ++field5368;
         return this.field5428[this.field5436++];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[59] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(IJI)V",
      line = 939
   )
   public final void method2887(int param1, long param2, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "([IIII)V",
      line = 965
   )
   public final void method2888(int[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5376;
         int var5 = this.field5436;
         this.field5436 = arg2;
         int var6 = (arg1 - arg2) / arg3;

         for(int var7 = 0; ~var7 > ~var6; ++var7) {
            int var8 = this.method2894(101);
            int var9 = this.method2894(122);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;

            while(var12-- > 0) {
               var9 -= (var8 >>> 5 ^ var8 << 4) - -var8 ^ arg0[(6764 & var10) >>> 11] + var10;
               var10 -= var11;
               var8 -= arg0[3 & var10] + var10 ^ (var9 >>> 5 ^ var9 << 4) - -var9;
            }

            this.field5436 -= 8;
            this.method2849(var8, (byte)-34);
            this.method2849(var9, (byte)-34);
         }

         this.field5436 = var5;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field5440[51] + (arg0 != null ? field5440[6] : field5440[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(Z)B",
      line = 1010
   )
   public final byte method2889(boolean arg0) {
      try {
         if (!arg0) {
            this.method2886((byte)-127);
         }

         ++field5417;
         return (byte)(128 + -this.field5428[this.field5436++]);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "c",
      descriptor = "(II)J",
      line = 1022
   )
   public final long method2890(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         int var9 = arg1 - 1;
         ++field5383;
         if (var9 >= 0 && ~var9 >= -8) {
            int var4 = var9 * 8;
            if (arg0 != 11140) {
               field5400 = null;
            }

            long var5 = 0L;
            if (var3) {
               var5 |= ((long)this.field5428[this.field5436++] & 255L) << var4;
               var4 -= 8;
            }

            while(true) {
               while(~var4 <= -1) {
                  var5 |= ((long)this.field5428[this.field5436++] & 255L) << var4;
                  var4 -= 8;
               }

               if (!var3) {
                  return var5;
               }

               var5 = var5;
               var4 -= 8;
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field5440[69] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "g",
      descriptor = "(I)I",
      line = 1051
   )
   public final int method2891(int arg0) {
      try {
         ++field5419;
         byte var2 = this.field5428[this.field5436++];
         int var3 = arg0;

         while(~var2 > -1) {
            var3 = (127 & var2 | var3) << 7;
            var2 = this.field5428[this.field5436++];
         }

         return var2 | var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[47] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(IJ)V",
      line = 1069
   )
   public final void method2892(int arg0, long arg1) {
      try {
         ++field5439;
         this.field5428[this.field5436++] = (byte)((int)(arg1 >> 56));
         this.field5428[this.field5436++] = (byte)((int)(arg1 >> 48));
         this.field5428[this.field5436++] = (byte)((int)(arg1 >> 40));
         this.field5428[this.field5436++] = (byte)((int)(arg1 >> 32));
         this.field5428[this.field5436++] = (byte)((int)(arg1 >> 24));
         this.field5428[this.field5436++] = (byte)((int)(arg1 >> 16));
         this.field5428[this.field5436++] = (byte)((int)(arg1 >> 8));
         this.field5428[this.field5436++] = (byte)((int)arg1);
         if (arg0 > -4) {
            this.method2839((byte)74);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[36] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "(BI)V",
      line = 1087
   )
   public final void method2893(byte arg0, int arg1) {
      try {
         if (arg0 > 36) {
            this.field5428[this.field5436++] = (byte)(-arg1);
            ++field5406;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[44] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "q",
      descriptor = "(I)I",
      line = 1102
   )
   public final int method2894(int arg0) {
      try {
         if (arg0 <= 95) {
            return 1;
         } else {
            ++field5430;
            this.field5436 += 4;
            return (-16777216 & this.field5428[this.field5436 + -4] << 24) + (this.field5428[this.field5436 + -1] & 255) - (-((this.field5428[this.field5436 - 2] & 255) << 8) + -((255 & this.field5428[this.field5436 + -3]) << 16));
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[61] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "c",
      descriptor = "(IB)V",
      line = 1120
   )
   public final void method2895(int arg0, byte arg1) {
      try {
         this.field5428[this.field5436++] = (byte)(-arg0 + 128);
         if (arg1 != -5) {
            this.method2901(-24, -32);
         }

         ++field5414;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[67] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "c",
      descriptor = "(I)I",
      line = 1131
   )
   public final int method2896(int arg0) {
      try {
         if (arg0 != 0) {
            this.field5436 = 13;
         }

         ++field5375;
         int var2 = 255 & this.field5428[this.field5436];
         return ~var2 > -129 ? this.method2855(arg0 ^ -31007) : this.method2848(arg0 + -108) + -32768;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[55] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "h",
      descriptor = "(II)I",
      line = 1150
   )
   public final int method2897(int arg0, int arg1) {
      try {
         if (arg1 < 97) {
            this.method2897(109, -95);
         }

         ++field5413;
         int var3 = class180.method1632(2, arg0, this.field5436, this.field5428);
         this.method2849(var3, (byte)-34);
         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5440[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "l",
      descriptor = "(I)J",
      line = 1172
   )
   public final long method2898(int arg0) {
      try {
         if (arg0 != 32109) {
            return 35L;
         } else {
            ++field5388;
            long var2 = 4294967295L & (long)this.method2894(114);
            long var4 = 4294967295L & (long)this.method2894(96);
            return (var2 << 32) + var4;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5440[57] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "([BIII)V",
      line = 1188
   )
   public final void method2899(byte[] param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ica",
      name = "d",
      descriptor = "(IB)V",
      line = 1211
   )
   public final void method2900(int arg0, byte arg1) {
      try {
         ++field5433;
         this.field5428[this.field5436++] = (byte)(arg0 >> 16);
         this.field5428[this.field5436++] = (byte)(arg0 >> 8);
         this.field5428[this.field5436++] = (byte)arg0;
         if (arg1 != 71) {
            this.field5428 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[58] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "d",
      descriptor = "(II)V",
      line = 1227
   )
   public final void method2901(int arg0, int arg1) {
      try {
         if (arg0 == 8) {
            this.field5428[this.field5436++] = (byte)arg1;
            ++field5390;
            this.field5428[this.field5436++] = (byte)(arg1 >> 8);
            this.field5428[this.field5436++] = (byte)(arg1 >> 16);
            this.field5428[this.field5436++] = (byte)(arg1 >> 24);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5440[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "<init>",
      descriptor = "(I)V",
      line = 1241
   )
   public class354(int arg0) {
      try {
         this.field5436 = 0;
         this.field5428 = class56.method419(arg0, (byte)-81);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "<init>",
      descriptor = "([B)V",
      line = 1249
   )
   public class354(byte[] arg0) {
      try {
         this.field5436 = 0;
         this.field5428 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5440[35] + (arg0 != null ? field5440[6] : field5440[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2902(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2903(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

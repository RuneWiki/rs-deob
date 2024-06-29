import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class200 extends class473 {
   @OriginalMember(
      owner = "client!kk",
      name = "Rb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3005 = new String[]{method1722(method1721("LQc\u001d\u001b")), method1722(method1721("\\\u0014cyN")), method1722(method1721("Y\n!_")), method1722(method1721("\\\u0014c\u007fN")), method1722(method1721("\\\u0014cxN")), method1722(method1721("\\\u0014cuN")), method1722(method1721("\\\u0014crN")), method1722(method1721("\\\u0014cpN")), method1722(method1721("\\\u0014c{N")), method1722(method1721("\\\u0014cqN")), method1722(method1721("\\\u0014cwN")), method1722(method1721("\\\u0014ctN")), method1722(method1721("\\\u0014czN")), method1722(method1721("\\\u0014cvN"))};
   @OriginalMember(
      owner = "client!kk",
      name = "Pb",
      descriptor = "[I"
   )
   public static int[] field3002 = new int[14];
   @OriginalMember(
      owner = "client!kk",
      name = "Gb",
      descriptor = "I"
   )
   public static int field2990;
   @OriginalMember(
      owner = "client!kk",
      name = "Qb",
      descriptor = "I"
   )
   public static int field2991;
   @OriginalMember(
      owner = "client!kk",
      name = "Nb",
      descriptor = "I"
   )
   private int field2992;
   @OriginalMember(
      owner = "client!kk",
      name = "Kb",
      descriptor = "I"
   )
   public static int field2993;
   @OriginalMember(
      owner = "client!kk",
      name = "Fb",
      descriptor = "I"
   )
   public static int field2994;
   @OriginalMember(
      owner = "client!kk",
      name = "Mb",
      descriptor = "I"
   )
   public static int field2995;
   @OriginalMember(
      owner = "client!kk",
      name = "Ib",
      descriptor = "I"
   )
   public static int field2996;
   @OriginalMember(
      owner = "client!kk",
      name = "Hb",
      descriptor = "I"
   )
   public static int field2997;
   @OriginalMember(
      owner = "client!kk",
      name = "Jb",
      descriptor = "I"
   )
   public static int field2998;
   @OriginalMember(
      owner = "client!kk",
      name = "Eb",
      descriptor = "I"
   )
   public static int field2999;
   @OriginalMember(
      owner = "client!kk",
      name = "Ob",
      descriptor = "I"
   )
   public static int field3000;
   @OriginalMember(
      owner = "client!kk",
      name = "Lb",
      descriptor = "I"
   )
   public static int field3001;
   @OriginalMember(
      owner = "client!kk",
      name = "Db",
      descriptor = "I"
   )
   public static int field3004;
   @OriginalMember(
      owner = "client!kk",
      name = "Cb",
      descriptor = "Lfj;"
   )
   private class681 field3003;

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "([IB)V",
      line = 4
   )
   public final void method1709(int[] arg0, byte arg1) {
      try {
         this.field3003 = new class681(arg0);
         if (arg1 >= -2) {
            this.method1719(-79);
         }

         ++field3004;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3005[11] + (arg0 != null ? field3005[0] : field3005[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "<init>",
      descriptor = "(I)V",
      line = 16
   )
   public class200(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!kk",
      name = "h",
      descriptor = "(Z)Z",
      line = 24
   )
   public final boolean method1710(boolean arg0) {
      try {
         ++field2995;
         if (!arg0) {
            return true;
         } else {
            int var2 = 255 & super.field6889[super.field6907] + -this.field3003.method4968(-1);
            return var2 >= 128;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3005[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "i",
      descriptor = "(B)V",
      line = 44
   )
   public final void method1711(byte arg0) {
      try {
         ++field2991;
         this.field2992 = super.field6907 * 8;
         if (arg0 != 125) {
            this.field3003 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3005[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "k",
      descriptor = "(B)I",
      line = 55
   )
   public final int method1712(byte arg0) {
      try {
         ++field2990;
         int var2 = 255 & super.field6889[super.field6907++] - this.field3003.method4965(10970);
         if (var2 < 128) {
            return var2;
         } else {
            if (arg0 < 47) {
               this.method1719(40);
            }

            return (super.field6889[super.field6907++] + -this.field3003.method4965(10970) & 255) + (var2 + -128 << 8);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3005[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "e",
      descriptor = "(BI)V",
      line = 72
   )
   public final void method1713(byte arg0, int arg1) {
      try {
         super.field6889[super.field6907++] = (byte)(arg1 + this.field3003.method4965(10970));
         if (arg0 != 80) {
            field3002 = null;
         }

         ++field2997;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3005[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "d",
      descriptor = "(BI)I",
      line = 84
   )
   public final int method1714(byte arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field2998;
         if (arg0 != -34) {
            field3002 = null;
         }

         int var4 = this.field2992 >> 3;
         int var5 = -(7 & this.field2992) + 8;
         this.field2992 += arg1;
         int var6 = 0;
         if (var3) {
            var6 += (class173.field2672[var5] & super.field6889[var4++]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
         }

         while(true) {
            while(~var5 > ~arg1) {
               var6 += (class173.field2672[var5] & super.field6889[var4++]) << -var5 + arg1;
               arg1 -= var5;
               var5 = 8;
            }

            if (!var3) {
               if (arg1 != var5) {
                  var6 += super.field6889[var4] >> -arg1 + var5 & class173.field2672[arg1];
                  if (!var3) {
                     return var6;
                  }
               }

               var6 += class173.field2672[var5] & super.field6889[var4];
               return var6;
            }

            arg1 -= var5;
            var5 = 8;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3005[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "x",
      descriptor = "(I)V",
      line = 122
   )
   public static void method1715(int arg0) {
      try {
         field3002 = null;
         if (arg0 != -1) {
            method1716((byte)93);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3005[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "j",
      descriptor = "(B)V",
      line = 132
   )
   public static final void method1716(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kk",
      name = "d",
      descriptor = "(IB)I",
      line = 527
   )
   public final int method1717(int arg0, byte arg1) {
      try {
         ++field2996;
         return arg1 != 9 ? -56 : arg0 * 8 + -this.field2992;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3005[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(BLfj;)V",
      line = 538
   )
   public final void method1718(byte arg0, class681 arg1) {
      try {
         ++field2994;
         this.field3003 = arg1;
         if (arg0 != -119) {
            this.field3003 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3005[13] + arg0 + ',' + (arg1 != null ? field3005[0] : field3005[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "w",
      descriptor = "(I)V",
      line = 550
   )
   public final void method1719(int arg0) {
      try {
         super.field6907 = (this.field2992 + 7) / 8;
         ++field2999;
         if (arg0 != -1537210170) {
            field3002 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3005[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(BI[BI)V",
      line = 566
   )
   public final void method1720(byte param1, int param2, byte[] param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1721(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1722(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

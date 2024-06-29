import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class429 {
   @OriginalMember(
      owner = "client!qba",
      name = "b",
      descriptor = "Ltv;"
   )
   private class590 field5983 = new class590(64);
   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "Ltv;"
   )
   public class590 field5985 = new class590(2);
   @OriginalMember(
      owner = "client!qba",
      name = "f",
      descriptor = "Lqh;"
   )
   private class74 field5982;
   @OriginalMember(
      owner = "client!qba",
      name = "e",
      descriptor = "Lqh;"
   )
   public class74 field5984;
   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5986 = new String[]{method3223(method3222("{!\u001eDd\"")), method3223(method3222("{!\u001eDe\"")), method3223(method3222("{!\u001eDb\"")), method3223(method3222("{!\u001eDc\"")), method3223(method3222("{!\u001eDg\"")), method3223(method3222("{!\u001eD\u001ac-\u0016\u001e\u0018\"")), method3223(method3222("d6\u0013\u0006")), method3223(method3222("qmQD["))};
   @OriginalMember(
      owner = "client!qba",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field5975 = new int[4096];
   @OriginalMember(
      owner = "client!qba",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field5979 = true;
   @OriginalMember(
      owner = "client!qba",
      name = "i",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field5981 = new String[][]{{method3223(method3222("@\"\u0011")), method3223(method3222("L&\u001d")), method3223(method3222("G\"\r")), method3223(method3222("K3\r")), method3223(method3222("G\"\u0006")), method3223(method3222("@6\u0011")), method3223(method3222("@6\u0013")), method3223(method3222("K6\u0018")), method3223(method3222("Y&\u000f")), method3223(method3222("E \u000b")), method3223(method3222("D,\t")), method3223(method3222("N&\u001c"))}, {method3223(method3222("@\"\u0011")), method3223(method3222("L&\u001d")), method3223(method3222("G§\r")), method3223(method3222("K3\r")), method3223(method3222("G\"\u0016")), method3223(method3222("@6\u0011")), method3223(method3222("@6\u0013")), method3223(method3222("K6\u0018")), method3223(method3222("Y&\u000f")), method3223(method3222("E(\u000b")), method3223(method3222("D,\t")), method3223(method3222("N&\u0005"))}, {method3223(method3222("`\"\u0011")), method3223(method3222("lª\t")), method3223(method3222("g\"\r\u0019")), method3223(method3222("k5\r")), method3223(method3222("g\"\u0016")), method3223(method3222("`6\u0016\u0004")), method3223(method3222("`6\u0016\u0006")), method3223(method3222("k,\u0084\u001e")), method3223(method3222("y&\u000f\u001e")), method3223(method3222("e \u000b")), method3223(method3222("d,\t")), method3223(method3222("nª\u001c"))}, {method3223(method3222("`\"\u0011")), method3223(method3222("l&\t")), method3223(method3222("g\"\r")), method3223(method3222("k!\r")), method3223(method3222("g\"\u0016")), method3223(method3222("`6\u0011")), method3223(method3222("`6\u0013")), method3223(method3222("k$\u0010")), method3223(method3222("y&\u000b")), method3223(method3222("e6\u000b")), method3223(method3222("d,\t")), method3223(method3222("n&\u0005"))}, {method3223(method3222("`\"\u0011")), method3223(method3222("l&\u001d")), method3223(method3222("g1\u000b")), method3223(method3222("k3\r")), method3223(method3222("g&\u0016")), method3223(method3222("`6\u0011")), method3223(method3222("`6\u0013")), method3223(method3222("k6\u0018")), method3223(method3222("y&\u000f")), method3223(method3222("e(\u000b")), method3223(method3222("d,\t")), method3223(method3222("n&\u001c"))}};
   @OriginalMember(
      owner = "client!qba",
      name = "g",
      descriptor = "I"
   )
   public static int field5976;
   @OriginalMember(
      owner = "client!qba",
      name = "j",
      descriptor = "I"
   )
   public static int field5977;
   @OriginalMember(
      owner = "client!qba",
      name = "c",
      descriptor = "I"
   )
   public static int field5978;
   @OriginalMember(
      owner = "client!qba",
      name = "d",
      descriptor = "I"
   )
   public static int field5980;

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method3217(int arg0, boolean arg1) {
      try {
         if (arg1) {
            this.field5983 = null;
         }

         class590 var3 = this.field5983;
         synchronized(this.field5983) {
            this.field5983.method4234(2, arg0);
         }

         ++field5977;
         class590 var4 = this.field5985;
         synchronized(this.field5985) {
            this.field5985.method4234(2, arg0);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field5986[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3218(int arg0) {
      try {
         ++field5976;
         class590 var2 = this.field5983;
         synchronized(this.field5983) {
            this.field5983.method4244(true);
         }

         class590 var3 = this.field5985;
         synchronized(this.field5985) {
            if (arg0 > 28) {
               this.field5985.method4244(true);
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field5986[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(ZI)Lcka;"
   )
   public final class185 method3219(boolean arg0, int arg1) {
      try {
         ++field5980;
         class590 var3 = this.field5983;
         class185 var4;
         synchronized(this.field5983) {
            var4 = (class185)this.field5983.method4239((long)arg1, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field5982;
            byte[] var6;
            synchronized(this.field5982) {
               var6 = this.field5982.method732(arg1, 33, (byte)80);
            }

            class185 var7 = new class185();
            var7.field2276 = this;
            if (var6 != null) {
               var7.method1413(new class594(var6), 32220);
            }

            if (arg0) {
               return null;
            } else {
               class590 var8 = this.field5983;
               synchronized(this.field5983) {
                  this.field5983.method4238(80, var7, (long)arg1);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field5986[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3220(int arg0) {
      try {
         ++field5978;
         class590 var2 = this.field5983;
         synchronized(this.field5983) {
            this.field5983.method4245(true);
         }

         class590 var3 = this.field5985;
         synchronized(this.field5985) {
            if (arg0 > -33) {
               this.field5982 = null;
            }

            this.field5985.method4245(true);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5986[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3221(int arg0) {
      try {
         field5981 = null;
         if (arg0 >= -25) {
            field5975 = null;
         }

         field5975 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5986[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "<init>",
      descriptor = "(Lnc;ILqh;Lqh;)V"
   )
   public class429(class26 arg0, int arg1, class74 arg2, class74 arg3) {
      try {
         this.field5982 = arg2;
         this.field5984 = arg3;
         this.field5982.method727(33, -32767);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5986[5] + (arg0 != null ? field5986[7] : field5986[6]) + ',' + arg1 + ',' + (arg2 != null ? field5986[7] : field5986[6]) + ',' + (arg3 != null ? field5986[7] : field5986[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3222(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3223(char[] arg0) {
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
            var10005 = 67;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

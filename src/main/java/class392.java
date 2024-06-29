import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class392 {
   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "Llj;"
   )
   private class304 field6156 = new class304(64);
   @OriginalMember(
      owner = "client!paa",
      name = "i",
      descriptor = "Lrr;"
   )
   private class678 field6152;
   @OriginalMember(
      owner = "client!paa",
      name = "d",
      descriptor = "I"
   )
   public int field6159;
   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6160 = new String[]{method3168(method3167("\f!n9\u0017T")), method3168(method3167("\f!n9\u0010T")), method3168(method3167("\f!n9\u0016T")), method3168(method3167("\u00125c{")), method3168(method3167("\u0007n!9(")), method3168(method3167("\f!n9i\u0015.fckT")), method3168(method3167("\f!n9\u0014T")), method3168(method3167("\f!n9\u0011T"))};
   @OriginalMember(
      owner = "client!paa",
      name = "f",
      descriptor = "Leh;"
   )
   public static class19 field6155 = new class19(3);
   @OriginalMember(
      owner = "client!paa",
      name = "h",
      descriptor = "I"
   )
   public static int field6151;
   @OriginalMember(
      owner = "client!paa",
      name = "c",
      descriptor = "I"
   )
   public static int field6154;
   @OriginalMember(
      owner = "client!paa",
      name = "b",
      descriptor = "I"
   )
   public static int field6157;
   @OriginalMember(
      owner = "client!paa",
      name = "e",
      descriptor = "I"
   )
   public static int field6158;
   @OriginalMember(
      owner = "client!paa",
      name = "g",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field6153;

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(II)Lou;"
   )
   public final class76 method3162(int arg0, int arg1) {
      try {
         ++field6157;
         class304 var3 = this.field6156;
         class76 var4;
         synchronized(this.field6156) {
            var4 = (class76)this.field6156.method2544(false, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            int var5 = 125 / ((52 - arg0) / 38);
            class678 var6 = this.field6152;
            byte[] var7;
            synchronized(this.field6152) {
               var7 = this.field6152.method5017(47, arg1, (byte)71);
            }

            class76 var8 = new class76();
            if (var7 != null) {
               var8.method720(new class354(var7), (byte)-52);
            }

            class304 var9 = this.field6156;
            synchronized(this.field6156) {
               this.field6156.method2545((long)arg1, 126, var8);
               return var8;
            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field6160[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3163(int arg0) {
      try {
         ++field6158;
         class304 var2 = this.field6156;
         synchronized(this.field6156) {
            if (arg0 != 47) {
               field6155 = null;
            }

            this.field6156.method2551(true);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6160[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3164(int arg0) {
      try {
         class304 var2 = this.field6156;
         synchronized(this.field6156) {
            this.field6156.method2554(-120);
         }

         ++field6154;
         if (arg0 != 0) {
            field6153 = null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6160[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method3165(int arg0, int arg1) {
      try {
         ++field6151;
         int var3 = -60 / ((arg1 - -35) / 48);
         class304 var4 = this.field6156;
         synchronized(this.field6156) {
            this.field6156.method2552(arg0, 21533);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6160[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3166(int arg0) {
      try {
         field6153 = null;
         if (arg0 < 87) {
            field6155 = null;
         }

         field6155 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6160[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V"
   )
   public class392(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field6152 = arg2;
         if (this.field6152 == null) {
            this.field6159 = 0;
         } else {
            this.field6159 = this.field6152.method4998((byte)-82, 47);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6160[5] + (arg0 != null ? field6160[4] : field6160[3]) + ',' + arg1 + ',' + (arg2 != null ? field6160[4] : field6160[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3167(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3168(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

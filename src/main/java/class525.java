import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class525 extends class297 {
   @OriginalMember(
      owner = "client!ds",
      name = "E",
      descriptor = "Ljava/lang/String;"
   )
   public String field8002;
   @OriginalMember(
      owner = "client!ds",
      name = "x",
      descriptor = "Lsf;"
   )
   public class475 field8005;
   @OriginalMember(
      owner = "client!ds",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8008 = new String[]{method4056(method4055("\u000fD1!k")), method4056(method4055("\u0005Bs\u000f")), method4056(method4055("\u0010\u00191M>")), method4056(method4055("\u000fD1\"k")), method4056(method4055("\u000fD1_*\u0005^k]k")), method4056(method4055("\u000fD1 k")), method4056(method4055("\u000fD1&k")), method4056(method4055("\u000fD1'k"))};
   @OriginalMember(
      owner = "client!ds",
      name = "C",
      descriptor = "Lds;"
   )
   public static class525 field7997;
   @OriginalMember(
      owner = "client!ds",
      name = "u",
      descriptor = "Lsg;"
   )
   public static class742 field7998;
   @OriginalMember(
      owner = "client!ds",
      name = "B",
      descriptor = "Luk;"
   )
   public static class498 field8006;
   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field8007;
   @OriginalMember(
      owner = "client!ds",
      name = "F",
      descriptor = "I"
   )
   public static int field7999;
   @OriginalMember(
      owner = "client!ds",
      name = "A",
      descriptor = "I"
   )
   public static int field8000;
   @OriginalMember(
      owner = "client!ds",
      name = "v",
      descriptor = "I"
   )
   public static int field8001;
   @OriginalMember(
      owner = "client!ds",
      name = "w",
      descriptor = "I"
   )
   public static int field8003;
   @OriginalMember(
      owner = "client!ds",
      name = "y",
      descriptor = "I"
   )
   public int field8004;

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(BLria;)Z"
   )
   public final boolean method4050(byte arg0, class185 arg1) {
      boolean var3 = client.field1786;

      try {
         ++field8000;
         boolean var4 = true;
         arg1.method2495(-24134);
         if (arg0 >= -96) {
            this.method4052(5);
         }

         class185 var5 = (class185)this.field8005.method3688(true);
         boolean var10000;
         if (var3) {
            var10000 = class31.method220(1000, var5.field2896, arg1.field2896);
         } else if (var5 == null) {
            this.field8005.method3693(arg1, true);
            ++this.field8004;
            var10000 = var4;
            if (!var3) {
               return var4;
            }
         } else {
            var10000 = class31.method220(1000, var5.field2896, arg1.field2896);
         }

         while(!var10000) {
            var5 = (class185)this.field8005.method3691(20);
            var4 = false;
            if (var5 == null) {
               this.field8005.method3693(arg1, true);
               ++this.field8004;
               var10000 = var4;
               if (!var3) {
                  return var4;
               }
            } else {
               var10000 = class31.method220(1000, var5.field2896, arg1.field2896);
            }
         }

         class324.method2652(var5, arg1, 0);
         ++this.field8004;
         if (var4) {
            return false;
         } else {
            return true;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8008[0] + arg0 + ',' + (arg1 != null ? field8008[2] : field8008[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4051(int arg0) {
      try {
         field8006 = null;
         field7998 = null;
         int var1 = 66 / ((arg0 - -58) / 38);
         field7997 = null;
         field8007 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8008[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "g",
      descriptor = "(I)I"
   )
   public final int method4052(int arg0) {
      try {
         ++field7999;
         if (this.field8005.field7220.field4682 != this.field8005.field7220) {
            return ((class185)this.field8005.field7220.field4682).field2896;
         } else {
            if (arg0 != 11104) {
               this.field8005 = null;
            }

            return -1;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8008[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(BJ)V"
   )
   public static final void method4053(byte arg0, long arg1) {
      try {
         try {
            Thread.sleep(arg1);
         } catch (InterruptedException var4) {
         }

         if (arg0 != 58) {
            field7998 = null;
         }

         ++field8001;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8008[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "b",
      descriptor = "(BLria;)Z"
   )
   public final boolean method4054(byte arg0, class185 arg1) {
      try {
         ++field8003;
         if (arg0 >= -89) {
            return false;
         } else {
            int var3 = this.method4052(11104);
            arg1.method2495(-24134);
            --this.field8004;
            if (this.field8004 != 0) {
               return ~var3 != ~this.method4052(11104);
            } else {
               this.method2477(1976);
               this.method2495(-24134);
               --class97.field1368;
               class630.field9113.method2545(arg1.field2895, 111, this);
               return false;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8008[7] + arg0 + ',' + (arg1 != null ? field8008[2] : field8008[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class525(String arg0) {
      try {
         this.field8002 = arg0;
         this.field8005 = new class475();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8008[4] + (arg0 != null ? field8008[2] : field8008[1]) + ')');
      }
   }

   static {
      new class642("", 76);
      field7997 = null;
      field7998 = new class742();
      field8006 = new class498(12, 0);
      field8007 = new int[2];
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4055(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4056(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

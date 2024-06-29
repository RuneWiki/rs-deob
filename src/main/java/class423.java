import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class423 {
   @OriginalMember(
      owner = "client!qba",
      name = "i",
      descriptor = "Lgw;"
   )
   private class179 field6161 = new class179(128);
   @OriginalMember(
      owner = "client!qba",
      name = "f",
      descriptor = "Lgw;"
   )
   public class179 field6162 = new class179(64);
   @OriginalMember(
      owner = "client!qba",
      name = "h",
      descriptor = "Lhw;"
   )
   private class141 field6152;
   @OriginalMember(
      owner = "client!qba",
      name = "j",
      descriptor = "Lhw;"
   )
   public class141 field6159;
   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6163 = new String[]{method3215(method3214("[O+L\u007f\u0002")), method3215(method3214("[O+Ly\u0002")), method3215(method3214("DX&\u000e")), method3215(method3214("Q\u0003dL@")), method3215(method3214("[O+L|\u0002")), method3215(method3214("[O+Lx\u0002")), method3215(method3214("\nj\u00076")), method3215(method3214("\u0006\r")), method3215(method3214("[O+L\u0001CC#\u0016\u0003\u0002")), method3215(method3214("[O+L~\u0002")), method3215(method3214("[O+L{\u0002")), method3215(method3214("[O+Lz\u0002"))};
   @OriginalMember(
      owner = "client!qba",
      name = "l",
      descriptor = "I"
   )
   public static int field6153 = 0;
   @OriginalMember(
      owner = "client!qba",
      name = "c",
      descriptor = "I"
   )
   public static int field6151;
   @OriginalMember(
      owner = "client!qba",
      name = "k",
      descriptor = "I"
   )
   public static int field6154;
   @OriginalMember(
      owner = "client!qba",
      name = "b",
      descriptor = "I"
   )
   public static int field6155;
   @OriginalMember(
      owner = "client!qba",
      name = "g",
      descriptor = "I"
   )
   public static int field6156;
   @OriginalMember(
      owner = "client!qba",
      name = "d",
      descriptor = "I"
   )
   public static int field6157;
   @OriginalMember(
      owner = "client!qba",
      name = "e",
      descriptor = "I"
   )
   public static int field6158;
   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "I"
   )
   public static int field6160;

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(II)Lct;"
   )
   public final class155 method3207(int arg0, int arg1) {
      try {
         ++field6154;
         class179 var3 = this.field6161;
         class155 var4;
         synchronized(this.field6161) {
            var4 = (class155)this.field6161.method1584((long)arg0, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field6152;
            byte[] var6;
            synchronized(this.field6152) {
               var6 = this.field6152.method1347((byte)123, arg1, arg0);
            }

            class155 var7 = new class155();
            var7.field2471 = this;
            var7.field2474 = arg0;
            if (var6 != null) {
               var7.method1434(arg1 + -26, new class473(var6));
            }

            var7.method1432(-1);
            class179 var8 = this.field6161;
            synchronized(this.field6161) {
               this.field6161.method1581((long)arg0, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field6163[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(JI)Ljava/lang/String;"
   )
   public static final String method3208(long arg0, int arg1) {
      try {
         ++field6155;
         class216.field3255.setTime(new Date(arg0));
         if (arg1 != -14526) {
            method3213(126, (String)null);
         }

         int var3 = class216.field3255.get(7);
         int var4 = class216.field3255.get(5);
         int var5 = class216.field3255.get(2);
         int var6 = class216.field3255.get(1);
         int var7 = class216.field3255.get(11);
         int var8 = class216.field3255.get(12);
         int var9 = class216.field3255.get(13);
         return class681.field9993[var3 + -1] + field6163[7] + var4 / 10 + var4 % 10 + "-" + class688.field10100[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + field6163[6];
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field6163[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3209(boolean arg0) {
      try {
         ++field6151;
         class179 var2 = this.field6161;
         synchronized(this.field6161) {
            this.field6161.method1589((byte)59);
            if (!arg0) {
               this.method3210(-100);
            }
         }

         class179 var3 = this.field6162;
         synchronized(this.field6162) {
            this.field6162.method1589((byte)117);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6163[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3210(int arg0) {
      try {
         class179 var2 = this.field6161;
         synchronized(this.field6161) {
            this.field6161.method1591((byte)58);
         }

         ++field6156;
         if (arg0 >= 87) {
            class179 var3 = this.field6162;
            synchronized(this.field6162) {
               this.field6162.method1591((byte)58);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6163[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3211(int arg0, byte arg1) {
      try {
         class179 var3 = this.field6161;
         synchronized(this.field6161) {
            this.field6161.method1579(99, arg0);
         }

         ++field6160;
         int var4 = 58 / ((-3 - arg1) / 60);
         class179 var5 = this.field6162;
         synchronized(this.field6162) {
            this.field6162.method1579(-98, arg0);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field6163[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method3212(int arg0, int arg1, int arg2) {
      try {
         this.field6161 = new class179(arg1);
         if (arg2 != 36) {
            this.field6161 = null;
         }

         ++field6158;
         this.field6162 = new class179(arg0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6163[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(ILjava/lang/String;)Z"
   )
   public static final boolean method3213(int arg0, String arg1) {
      try {
         ++field6157;
         if (arg0 != 13) {
            method3208(78L, -42);
         }

         return class74.field1312.containsKey(arg1);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6163[4] + arg0 + ',' + (arg1 != null ? field6163[3] : field6163[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "<init>",
      descriptor = "(Lca;ILhw;Lhw;)V"
   )
   public class423(class320 arg0, int arg1, class141 arg2, class141 arg3) {
      try {
         this.field6152 = arg2;
         this.field6159 = arg3;
         this.field6152.method1346(36, 0);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6163[8] + (arg0 != null ? field6163[3] : field6163[2]) + ',' + arg1 + ',' + (arg2 != null ? field6163[3] : field6163[2]) + ',' + (arg3 != null ? field6163[3] : field6163[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3214(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3215(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

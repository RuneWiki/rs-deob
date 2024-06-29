import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class180 extends class67 {
   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2802 = new String[]{method1640(method1639("+\u0013=es")), method1640(method1639("3P=\u0000&")), method1640(method1639("&\u000b\u007fB")), method1640(method1639("+\u0013=hs")), method1640(method1639("+\u0013=ds")), method1640(method1639("+\u0013=ls")), method1640(method1639("+\u0013=fs")), method1640(method1639("+\u0013=ms")), method1640(method1639("+\u0013=is")), method1640(method1639("+\u0013=gs")), method1640(method1639("+\u0013=bs")), method1640(method1639("+\u0013=js")), method1640(method1639("+\u0013=os")), method1640(method1639(",\u000b~C\"")), method1640(method1639("+\u0013=ks"))};
   @OriginalMember(
      owner = "client!cm",
      name = "m",
      descriptor = "[[B"
   )
   public static byte[][] field2800 = new byte[250][];
   @OriginalMember(
      owner = "client!cm",
      name = "k",
      descriptor = "I"
   )
   public static int field2790;
   @OriginalMember(
      owner = "client!cm",
      name = "n",
      descriptor = "I"
   )
   public static int field2791;
   @OriginalMember(
      owner = "client!cm",
      name = "r",
      descriptor = "I"
   )
   public static int field2792;
   @OriginalMember(
      owner = "client!cm",
      name = "q",
      descriptor = "I"
   )
   public static int field2793;
   @OriginalMember(
      owner = "client!cm",
      name = "o",
      descriptor = "I"
   )
   public static int field2794;
   @OriginalMember(
      owner = "client!cm",
      name = "s",
      descriptor = "I"
   )
   public static int field2795;
   @OriginalMember(
      owner = "client!cm",
      name = "u",
      descriptor = "I"
   )
   public static int field2796;
   @OriginalMember(
      owner = "client!cm",
      name = "p",
      descriptor = "I"
   )
   public static int field2797;
   @OriginalMember(
      owner = "client!cm",
      name = "l",
      descriptor = "I"
   )
   public static int field2798;
   @OriginalMember(
      owner = "client!cm",
      name = "t",
      descriptor = "I"
   )
   public static int field2799;
   @OriginalMember(
      owner = "client!cm",
      name = "v",
      descriptor = "I"
   )
   public static int field2801;

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         ++field2796;
         if (arg0 != -69) {
            field2800 = null;
         }

         if (super.field881.method292((byte)118) == class103.field1438) {
            super.field877 = 2;
         }

         if (~super.field877 > -1 || super.field877 > 2) {
            super.field877 = this.method162(arg0 ^ -69);
         }

      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2802[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1631(int arg0) {
      try {
         field2800 = null;
         if (arg0 != -1976432919) {
            method1632(-88, -54, 107, (byte[])null);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2802[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(III[B)I"
   )
   public static final int method1632(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         ++field2797;
         int var4 = -1;
         if (arg0 != 2) {
            method1636((byte)-40);
         }

         for(int var5 = arg1; ~arg2 < ~var5; ++var5) {
            var4 = class585.field8643[(var4 ^ arg3[var5]) & 255] ^ var4 >>> 8;
         }

         return ~var4;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2802[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2802[1] : field2802[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         ++field2793;
         return arg0 != 0 ? -14 : 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2802[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class180(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!cm",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1633(int arg0) {
      try {
         ++field2792;
         return arg0 != 480102311 ? 101 : super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2802[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field2795;
         if (arg1 >= -74) {
            method1631(6);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2802[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method1634(byte arg0, int arg1) {
      try {
         if (arg0 < 107) {
            method1637((byte)103, (class652)null);
         }

         ++field2790;
         return arg1 >> 11 & 127;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2802[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class180(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(BLjava/lang/Object;Lsu;)V"
   )
   public static final void method1635(byte arg0, Object arg1, class289 arg2) {
      boolean var3 = client.field1786;

      try {
         ++field2801;
         if (arg2.field4560 != null) {
            int var4 = 0;
            if (var3) {
               class697.method5128(1L, -88);
               ++var4;
            }

            while(~var4 > -51 && arg2.field4560.peekEvent() != null) {
               class697.method5128(1L, -88);
               ++var4;
            }

            int var5 = -106 % ((-32 - arg0) / 51);

            try {
               if (arg1 != null) {
                  arg2.field4560.postEvent(new ActionEvent(arg1, 1001, field2802[13]));
               }
            } catch (Exception var7) {
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2802[12] + arg0 + ',' + (arg1 != null ? field2802[1] : field2802[2]) + ',' + (arg2 != null ? field2802[1] : field2802[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1636(byte arg0) {
      try {
         class708.field10664 = 0;
         ++field2794;
         int var1 = (class476.field7251.field1505 >> 9) + class120.field1694;
         if (arg0 > 35) {
            int var2 = (class476.field7251.field1494 >> 9) + class119.field1606;
            if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && var2 <= 3136) {
               class708.field10664 = 1;
            }

            if (var1 >= 3072 && ~var1 >= -3119 && var2 >= 9492 && var2 <= 9535) {
               class708.field10664 = 1;
            }

            if (class708.field10664 == 1 && ~var1 <= -3140 && ~var1 >= -3200 && ~var2 <= -3009 && var2 <= 3062) {
               class708.field10664 = 0;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2802[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field2791;
         if (!arg1) {
            field2800 = null;
         }

         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2802[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(BLc;)V"
   )
   public static final void method1637(byte arg0, class652 arg1) {
      try {
         ++field2798;
         if (class425.field6572 == null) {
            class52 var2 = new class52();
            byte[] var3 = var2.method355(16, 255, 128, 128);
            class425.field6572 = class408.method3272(false, var3, 0);
         }

         if (class733.field10930 == null) {
            class302 var4 = new class302();
            byte[] var5 = var4.method2525(128, 128, true, 16);
            class733.field10930 = class408.method3272(false, var5, 0);
         }

         class758 var6 = arg1.field9619;
         if (var6.method5558(35632) && class475.field7225 == null) {
            byte[] var7 = class444.method3490(0.5F, 4.0F, 8, 16, 4.0F, 0, new class534(419684), 16.0F, 0.6F, 128, 128);
            class475.field7225 = class408.method3272(false, var7, 0);
         }

         if (arg0 >= -28) {
            field2800 = null;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field2802[9] + arg0 + ',' + (arg1 != null ? field2802[1] : field2802[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "b",
      descriptor = "(IB)V"
   )
   public static final void method1638(int arg0, byte arg1) {
      try {
         if (arg1 <= 29) {
            field2800 = null;
         }

         ++field2799;
         class566 var2 = class146.method1321((long)arg0, 1, -1428737160);
         var2.method4268(4);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2802[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1639(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1640(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class126 {
   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2115 = new String[]{method1230(method1229(")6K2")), method1230(method1229("<m\tpL")), method1230(method1229("6 Fpto")), method1230(method1229("6 Fpuo")), method1230(method1229("6 Fppo")), method1230(method1229("6 Fpso")), method1230(method1229("#6J3H")), method1230(method1229("6 Fpro"))};
   @OriginalMember(
      owner = "client!qca",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field2107 = new int[32];
   @OriginalMember(
      owner = "client!qca",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field2113;
   @OriginalMember(
      owner = "client!qca",
      name = "e",
      descriptor = "I"
   )
   public static int field2109;
   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "I"
   )
   public static int field2110;
   @OriginalMember(
      owner = "client!qca",
      name = "d",
      descriptor = "I"
   )
   public static int field2111;
   @OriginalMember(
      owner = "client!qca",
      name = "b",
      descriptor = "I"
   )
   public static int field2112;
   @OriginalMember(
      owner = "client!qca",
      name = "c",
      descriptor = "Lfj;"
   )
   public static class681 field2108;
   @OriginalMember(
      owner = "client!qca",
      name = "h",
      descriptor = "Lab;"
   )
   public static class696 field2114;

   static {
      int var0 = 2;

      for(int var1 = 0; ~var1 > -33; ++var1) {
         field2107[var1] = var0 - 1;
         var0 += var0;
      }

      field2113 = new int[1000];
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(BLjava/lang/Object;Loo;)V",
      line = 7
   )
   public static final void method1224(byte arg0, Object arg1, class651 arg2) {
      boolean var3 = client.field4564;

      try {
         ++field2111;
         if (arg2.field9450 != null) {
            int var4 = -8 % ((-67 - arg0) / 59);
            int var5 = 0;
            if (var3) {
               class624.method4569((byte)98, 1L);
               ++var5;
            }

            Object var10000;
            boolean var10001;
            while(true) {
               if (var5 >= 50) {
                  try {
                     var10000 = arg1;
                     break;
                  } catch (Exception var9) {
                     var10001 = false;
                     return;
                  }
               }

               var10000 = arg2.field9450.peekEvent();
               if (var3) {
                  break;
               }

               if (var10000 == null) {
                  try {
                     var10000 = arg1;
                     break;
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }
               }

               class624.method4569((byte)98, 1L);
               ++var5;
            }

            try {
               if (var10000 != null) {
                  arg2.field9450.postEvent(new ActionEvent(arg1, 1001, field2115[6]));
               }
            } catch (Exception var7) {
               var10001 = false;
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field2115[5] + arg0 + ',' + (arg1 != null ? field2115[1] : field2115[0]) + ',' + (arg2 != null ? field2115[1] : field2115[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(IZIILhw;I)V",
      line = 34
   )
   public static final void method1225(int arg0, boolean arg1, int arg2, int arg3, class141 arg4, int arg5) {
      try {
         if (arg3 == -7529) {
            class735.method5296(0L, arg4, 0, arg2, arg5, arg1, arg0);
            ++field2109;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2115[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2115[1] : field2115[0]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(B)V",
      line = 45
   )
   public static void method1226(byte arg0) {
      try {
         field2114 = null;
         if (arg0 != -92) {
            field2108 = null;
         }

         field2113 = null;
         field2107 = null;
         field2108 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2115[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(IZ)J",
      line = 60
   )
   public static final long method1227(int arg0, boolean arg1) {
      try {
         ++field2110;
         if (arg1) {
            method1228((String)null, (byte)-96, -8);
         }

         return (long)(arg0 + 11745) * 86400000L;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2115[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(Ljava/lang/String;BI)V",
      line = 72
   )
   public static final void method1228(String arg0, byte arg1, int arg2) {
      try {
         int var3 = -5 / ((arg1 - 72) / 51);
         ++field2112;
         class577.method4263("", true, "", "", arg0, 0, arg2);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2115[3] + (arg0 != null ? field2115[1] : field2115[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1229(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1230(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

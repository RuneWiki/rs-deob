import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class108 {
   @OriginalMember(
      owner = "client!eo",
      name = "h",
      descriptor = "Llj;"
   )
   private class304 field1489 = new class304(64);
   @OriginalMember(
      owner = "client!eo",
      name = "j",
      descriptor = "Lrr;"
   )
   private class678 field1492;
   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1493 = new String[]{method1037(method1036("t9\u001bY\u0016")), method1037(method1036("t9\u001b_\u0016")), method1037(method1036("t9\u001bX\u0016")), method1037(method1036("t9\u001b^\u0016")), method1037(method1036("jx\u001b5C")), method1037(method1036("t9\u001b'W\u007f?A%\u0016")), method1037(method1036("\u007f#Yw")), method1037(method1036("t9\u001bZ\u0016")), method1037(method1036("t9\u001b]\u0016"))};
   @OriginalMember(
      owner = "client!eo",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field1483 = false;
   @OriginalMember(
      owner = "client!eo",
      name = "k",
      descriptor = "I"
   )
   public static int field1485 = 0;
   @OriginalMember(
      owner = "client!eo",
      name = "f",
      descriptor = "Llj;"
   )
   public static class304 field1491 = new class304(20);
   @OriginalMember(
      owner = "client!eo",
      name = "i",
      descriptor = "I"
   )
   public static int field1482;
   @OriginalMember(
      owner = "client!eo",
      name = "b",
      descriptor = "I"
   )
   public static int field1484;
   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "I"
   )
   public static int field1486;
   @OriginalMember(
      owner = "client!eo",
      name = "e",
      descriptor = "I"
   )
   public static int field1487;
   @OriginalMember(
      owner = "client!eo",
      name = "g",
      descriptor = "I"
   )
   public static int field1488;
   @OriginalMember(
      owner = "client!eo",
      name = "d",
      descriptor = "I"
   )
   public static int field1490;

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(BI)Lcea;"
   )
   public final class87 method1030(byte arg0, int arg1) {
      try {
         ++field1482;
         class304 var3 = this.field1489;
         class87 var4;
         synchronized(this.field1489) {
            var4 = (class87)this.field1489.method2544(false, (long)arg1);
            if (arg0 > -103) {
               field1491 = null;
            }
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field1492;
            byte[] var6;
            synchronized(this.field1492) {
               var6 = this.field1492.method5017(class464.method3596((byte)103, arg1), class29.method205(1023, arg1), (byte)71);
            }

            class87 var7 = new class87();
            if (var6 != null) {
               var7.method841(-27157, new class354(var6));
            }

            class304 var8 = this.field1489;
            synchronized(this.field1489) {
               this.field1489.method2545((long)arg1, 118, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field1493[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method1031(int arg0, int arg1) {
      try {
         if (arg0 > 10) {
            class304 var3 = this.field1489;
            synchronized(this.field1489) {
               this.field1489.method2551(true);
               this.field1489 = new class304(arg1);
            }

            ++field1484;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1493[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1032(int arg0) {
      try {
         if (arg0 == 0) {
            class304 var2 = this.field1489;
            synchronized(this.field1489) {
               this.field1489.method2551(true);
            }

            ++field1487;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1493[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1033(int arg0, int arg1) {
      try {
         if (arg0 <= 114) {
            this.method1031(-94, -62);
         }

         class304 var3 = this.field1489;
         synchronized(this.field1489) {
            this.field1489.method2552(arg1, 21533);
         }

         ++field1486;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1493[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1034(int arg0) {
      try {
         if (arg0 != 3512) {
            field1491 = null;
         }

         field1491 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1493[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1035(int arg0) {
      try {
         ++field1488;
         class304 var2 = this.field1489;
         synchronized(this.field1489) {
            if (arg0 == 0) {
               this.field1489.method2554(-113);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1493[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V"
   )
   public class108(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field1492 = arg2;
         if (this.field1492 != null) {
            int var4 = this.field1492.method5008(-1) - 1;
            this.field1492.method4998((byte)-82, var4);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1493[5] + (arg0 != null ? field1493[4] : field1493[6]) + ',' + arg1 + ',' + (arg2 != null ? field1493[4] : field1493[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1036(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1037(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class218 {
   @OriginalMember(
      owner = "client!uga",
      name = "b",
      descriptor = "Lgw;"
   )
   private class179 field3293 = new class179(64);
   @OriginalMember(
      owner = "client!uga",
      name = "d",
      descriptor = "Lgw;"
   )
   public class179 field3302 = new class179(2);
   @OriginalMember(
      owner = "client!uga",
      name = "j",
      descriptor = "Lhw;"
   )
   private class141 field3298;
   @OriginalMember(
      owner = "client!uga",
      name = "e",
      descriptor = "Lhw;"
   )
   public class141 field3290;
   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3303 = new String[]{method1859(method1858("\"V^\u0004r\u007f")), method1859(method1858("\"V^\u0004w\u007f")), method1859(method1858("\"V^\u0004q\u007f")), method1859(method1858("\"V^\u0004v\u007f")), method1859(method1858("\"V^\u0004u\u007f")), method1859(method1858("\"V^\u0004t\u007f")), method1859(method1858("\"V^\u0004\f>_V^\u000e\u007f")), method1859(method1858("9DSF")), method1859(method1858(",\u001f\u0011\u0004M"))};
   @OriginalMember(
      owner = "client!uga",
      name = "m",
      descriptor = "I"
   )
   public static int field3294 = -1;
   @OriginalMember(
      owner = "client!uga",
      name = "c",
      descriptor = "[Lcf;"
   )
   public static class628[] field3299 = new class628[4];
   @OriginalMember(
      owner = "client!uga",
      name = "i",
      descriptor = "I"
   )
   public static int field3291;
   @OriginalMember(
      owner = "client!uga",
      name = "g",
      descriptor = "I"
   )
   public static int field3292;
   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "I"
   )
   public static int field3295;
   @OriginalMember(
      owner = "client!uga",
      name = "f",
      descriptor = "I"
   )
   public static int field3296;
   @OriginalMember(
      owner = "client!uga",
      name = "k",
      descriptor = "I"
   )
   public static int field3297;
   @OriginalMember(
      owner = "client!uga",
      name = "l",
      descriptor = "I"
   )
   public static int field3300;
   @OriginalMember(
      owner = "client!uga",
      name = "h",
      descriptor = "I"
   )
   public static int field3301;

   @OriginalMember(
      owner = "client!uga",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method1851(int arg0) {
      try {
         int var1 = 40 % ((35 - arg0) / 44);
         ++field3295;
         class393.field5787.method338(class56.field1115);
         class393.field5787.method429(class309.field4461, class618.field8982, class725.field10458, class650.field9425);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3303[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method1852(int arg0, byte arg1) {
      try {
         class179 var3 = this.field3293;
         synchronized(this.field3293) {
            this.field3293.method1579(112, arg0);
         }

         ++field3292;
         class179 var4 = this.field3302;
         synchronized(this.field3302) {
            this.field3302.method1579(-71, arg0);
         }

         if (arg1 < 55) {
            method1851(-6);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3303[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1853(byte arg0) {
      try {
         if (arg0 != 37) {
            field3294 = -93;
         }

         field3299 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3303[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1854(int arg0) {
      try {
         class179 var2 = this.field3293;
         synchronized(this.field3293) {
            this.field3293.method1589((byte)62);
            if (arg0 < 115) {
               method1851(-36);
            }
         }

         ++field3301;
         class179 var3 = this.field3302;
         synchronized(this.field3302) {
            this.field3302.method1589((byte)120);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3303[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "()V"
   )
   public static final void method1855() {
      for(int var0 = class626.field9116; var0 < class323.field4655; ++var0) {
         for(int var1 = 0; var1 < class479.field6989; ++var1) {
            for(int var2 = 0; var2 < class357.field5100; ++var2) {
               class600 var3 = class90.field1473[var0][var1][var2];
               if (var3 != null) {
                  class496 var4 = var3.field8659;
                  class496 var5 = var3.field8661;
                  if (var4 != null && var4.method601(0)) {
                     class30.method224(var4, var0, var1, var2, 1, 1);
                     if (var5 != null && var5.method601(0)) {
                        class30.method224(var5, var0, var1, var2, 1, 1);
                        var5.method579(0, false, var4, class49.field1047, 0, 0, 0);
                        var5.method594(255);
                     }

                     var4.method594(255);
                  }

                  for(class533 var6 = var3.field8653; var6 != null; var6 = var6.field7763) {
                     class144 var8 = var6.field7766;
                     if (var8 != null && var8.method601(0)) {
                        class30.method224(var8, var0, var1, var2, var8.field2356 - var8.field2354 + 1, var8.field2348 - var8.field2347 + 1);
                        var8.method594(255);
                     }
                  }

                  class417 var7 = var3.field8654;
                  if (var7 != null && var7.method601(0)) {
                     class118.method1120(var7, var0, var1, var2);
                     var7.method594(255);
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!uga",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1856(int arg0) {
      try {
         class179 var2 = this.field3293;
         synchronized(this.field3293) {
            this.field3293.method1591((byte)58);
            if (arg0 >= -100) {
               method1851(4);
            }
         }

         ++field3297;
         class179 var3 = this.field3302;
         synchronized(this.field3302) {
            this.field3302.method1591((byte)58);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3303[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(II)Lpia;"
   )
   public final class103 method1857(int arg0, int arg1) {
      try {
         ++field3291;
         class179 var3 = this.field3293;
         class103 var4;
         synchronized(this.field3293) {
            var4 = (class103)this.field3293.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field3298;
            byte[] var6;
            synchronized(this.field3298) {
               var6 = this.field3298.method1347((byte)123, arg0, arg1);
            }

            class103 var7 = new class103();
            var7.field1687 = this;
            if (var6 != null) {
               var7.method970(new class473(var6), false);
            }

            class179 var8 = this.field3293;
            synchronized(this.field3293) {
               this.field3293.method1581((long)arg1, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field3303[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "<init>",
      descriptor = "(Lca;ILhw;Lhw;)V"
   )
   public class218(class320 arg0, int arg1, class141 arg2, class141 arg3) {
      try {
         this.field3298 = arg2;
         this.field3290 = arg3;
         this.field3298.method1346(33, 0);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3303[6] + (arg0 != null ? field3303[8] : field3303[7]) + ',' + arg1 + ',' + (arg2 != null ? field3303[8] : field3303[7]) + ',' + (arg3 != null ? field3303[8] : field3303[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1858(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1859(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

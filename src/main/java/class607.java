import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class607 extends class624 {
   @OriginalMember(
      owner = "client!kha",
      name = "w",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field8849;
   @OriginalMember(
      owner = "client!kha",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8856 = new String[]{method4478(method4477("\u001dF8\u0004n^")), method4478(method4477("\r\u0000w\u0004Q")), method4478(method4477("\u0018[5F")), method4478(method4477("\u001dF8\u0004m^")), method4478(method4477("\u001dF8\u0004o^")), method4478(method4477("\u001dF8\u0004h^")), method4478(method4477("\u001dF8\u0004i^")), method4478(method4477("\u001dF8\u0004\u0010\u001f@0^\u0012^"))};
   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "F"
   )
   public static float field8850 = 1.0F;
   @OriginalMember(
      owner = "client!kha",
      name = "t",
      descriptor = "I"
   )
   public static int field8848;
   @OriginalMember(
      owner = "client!kha",
      name = "y",
      descriptor = "I"
   )
   public static int field8851;
   @OriginalMember(
      owner = "client!kha",
      name = "v",
      descriptor = "I"
   )
   public static int field8852;
   @OriginalMember(
      owner = "client!kha",
      name = "u",
      descriptor = "I"
   )
   public static int field8853;
   @OriginalMember(
      owner = "client!kha",
      name = "x",
      descriptor = "I"
   )
   public static int field8854;
   @OriginalMember(
      owner = "client!kha",
      name = "A",
      descriptor = "I"
   )
   public static int field8855;

   @OriginalMember(
      owner = "client!kha",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method4472(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field8852;
         class525 var2 = (class525)class681.field10158.method3688(true);
         if (var1) {
            if (~var2.field8004 < -2) {
               var2.field8004 = 0;
               class630.field9113.method2545(((class185)var2.field8005.field7220.field4682).field2895, 124, var2);
               var2.field8005.method3696(89);
            }

            var2 = (class525)class681.field10158.method3691(20);
         }

         while(true) {
            int var10000;
            byte var10001;
            if (var2 == null) {
               class558.field8307 = 0;
               class97.field1368 = 0;
               class326.field4958.method4981((byte)-94);
               class715.field10719.method3149(-119);
               class681.field10158.method3696(-92);
               class304.field4759 = false;
               var10000 = arg0;
               var10001 = 40;
               if (!var1) {
                  if (arg0 <= 40) {
                     field8850 = -0.08422356F;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = ~var2.field8004;
               var10001 = -2;
            }

            if (var10000 < var10001) {
               var2.field8004 = 0;
               class630.field9113.method2545(((class185)var2.field8005.field7220.field4682).field2895, 124, var2);
               var2.field8005.method3696(89);
            }

            var2 = (class525)class681.field10158.method3691(20);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8856[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method4473(int arg0) {
      try {
         if (arg0 != 255) {
            this.field8849 = null;
         }

         this.field8849.method5237();
         ++field8854;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8856[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method4474(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         if (arg1 > arg0) {
            int var4 = arg0;
            arg0 = arg1;
            arg1 = var4;
         }

         if (arg2 != 17432) {
            field8850 = 0.25133836F;
         }

         ++field8848;
         int var5;
         if (var3) {
            var5 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var5;
         }

         while(true) {
            int var10000;
            if (~arg1 == -1) {
               var10000 = arg0;
               if (!var3) {
                  return arg0;
               }
            } else {
               var10000 = arg0 % arg1;
            }

            var5 = var10000;
            arg0 = arg1;
            arg1 = var5;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8856[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class607(int arg0) {
      try {
         this.field8849 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8856[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method4475(byte arg0, int arg1) {
      try {
         ++field8851;
         class487.field7407 = false;
         class583.field8598 = -1;
         class618.field8993 = arg1;
         class326.field4957 = 1;
         class218.field3277 = null;
         class489.field7417 = null;
         if (arg0 == -115) {
            class222.field3337 = -1;
            class61.field788 = 0;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8856[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(Lvg;II)V"
   )
   public static final void method4476(class82 arg0, int arg1, int arg2) {
      try {
         ++field8853;
         if (~class465.field7069 > -51) {
            if (arg0 != null && arg0.field1176 != null && arg2 < arg0.field1176.length && arg0.field1176[arg2] != null) {
               int var3 = arg0.field1176[arg2][arg1];
               int var4 = var3 >> 8;
               int var5 = 7 & var3 >> 5;
               if (arg0.field1176[arg2].length > 1) {
                  int var6 = (int)(Math.random() * (double)arg0.field1176[arg2].length);
                  if (var6 > 0) {
                     var4 = arg0.field1176[arg2][var6];
                  }
               }

               int var7 = 256;
               if (arg0.field1163 != null && arg0.field1184 != null) {
                  var7 = class479.method3727((byte)-119, arg0.field1163[arg2], arg0.field1184[arg2]);
               }

               if (!arg0.field1162) {
                  class396.method3193(255, var5, 0, var7, (byte)-15, var4);
               } else {
                  class411.method3291(var4, true, var5, 255, 0, var7, false);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8856[0] + (arg0 != null ? field8856[1] : field8856[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4477(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4478(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

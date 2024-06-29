import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class583 extends class432 {
   @OriginalMember(
      owner = "client!si",
      name = "p",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field8441;
   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8444 = new String[]{method4330(method4329("Xdxj")), method4330(method4329("M?:(\\")), method4330(method4329("Ex:E\t")), method4330(method4329("Ex:D\t")), method4330(method4329("Ex:G\t")), method4330(method4329("Ex::HXx`8\t")), method4330(method4329("Ex:@\t"))};
   @OriginalMember(
      owner = "client!si",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field8440 = new int[1];
   @OriginalMember(
      owner = "client!si",
      name = "s",
      descriptor = "I"
   )
   public static int field8436;
   @OriginalMember(
      owner = "client!si",
      name = "v",
      descriptor = "I"
   )
   public static int field8437;
   @OriginalMember(
      owner = "client!si",
      name = "o",
      descriptor = "I"
   )
   public static int field8438;
   @OriginalMember(
      owner = "client!si",
      name = "r",
      descriptor = "I"
   )
   public static int field8439;
   @OriginalMember(
      owner = "client!si",
      name = "q",
      descriptor = "I"
   )
   public static int field8442;
   @OriginalMember(
      owner = "client!si",
      name = "u",
      descriptor = "I"
   )
   public static int field8443;
   @OriginalMember(
      owner = "client!si",
      name = "t",
      descriptor = "Lhw;"
   )
   public static class141 field8435;

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(Ltv;I)I",
      line = 5
   )
   public static final int method4325(class584 arg0, int arg1) {
      try {
         if (arg1 != 6406) {
            return -38;
         } else {
            ++field8436;
            if (class431.field6246 != arg0) {
               if (class296.field4146 != arg0) {
                  if (class776.field11354 == arg0) {
                     return 6406;
                  } else if (class153.field2444 != arg0) {
                     if (class434.field6278 == arg0) {
                        return 6410;
                     } else if (class669.field9743 == arg0) {
                        return 6145;
                     } else {
                        throw new IllegalStateException();
                     }
                  } else {
                     return 6409;
                  }
               } else {
                  return 6408;
               }
            } else {
               return 6407;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8444[2] + (arg0 != null ? field8444[1] : field8444[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "b",
      descriptor = "(I)V",
      line = 41
   )
   public final void method4326(int arg0) {
      try {
         if (arg0 != 1) {
            field8435 = null;
         }

         this.field8441.method5078();
         ++field8443;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8444[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "e",
      descriptor = "(I)V",
      line = 61
   )
   public static final void method4327(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!si",
      name = "b",
      descriptor = "(Z)V",
      line = 284
   )
   public static void method4328(boolean arg0) {
      try {
         field8440 = null;
         field8435 = null;
         if (arg0) {
            method4325((class584)null, -36);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8444[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "<init>",
      descriptor = "(I)V",
      line = 294
   )
   public class583(int arg0) {
      try {
         this.field8441 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8444[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4329(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4330(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

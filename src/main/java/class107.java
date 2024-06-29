import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class107 implements class184 {
   @OriginalMember(
      owner = "client!al",
      name = "h",
      descriptor = "I"
   )
   private int field1301 = 0;
   @OriginalMember(
      owner = "client!al",
      name = "c",
      descriptor = "I"
   )
   private int field1303 = -1;
   @OriginalMember(
      owner = "client!al",
      name = "j",
      descriptor = "Leh;"
   )
   public class379 field1304;
   @OriginalMember(
      owner = "client!al",
      name = "r",
      descriptor = "Z"
   )
   private boolean field1300;
   @OriginalMember(
      owner = "client!al",
      name = "f",
      descriptor = "I"
   )
   private int field1305;
   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1312 = new String[]{method930(method929("\u0011J#9M\u001eGa6^\u0015\u000e")), method930(method929("1tJ\u0017\u0005")), method930(method929("\u001eSa3")), method930(method929("\u000b\b#qY")), method930(method929("\u0011J#\u0011\f")), method930(method929("\u0011J#cM\u001eOya\f")), method930(method929("\u0011J#\u0013\f")), method930(method929("\u0011J#\u0012\f")), method930(method929("\u0011J#\u001a\f")), method930(method929("\u0011J#\u000f\f")), method930(method929("\u0011J#\u001b\f")), method930(method929("\u0011J#\u0017\f")), method930(method929("\u0011J#\u000e\f")), method930(method929("\u0011J#\u0010\f"))};
   @OriginalMember(
      owner = "client!al",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field1306 = false;
   @OriginalMember(
      owner = "client!al",
      name = "o",
      descriptor = "I"
   )
   public static int field1293;
   @OriginalMember(
      owner = "client!al",
      name = "g",
      descriptor = "I"
   )
   public static int field1294;
   @OriginalMember(
      owner = "client!al",
      name = "b",
      descriptor = "I"
   )
   public static int field1296;
   @OriginalMember(
      owner = "client!al",
      name = "i",
      descriptor = "I"
   )
   private int field1297;
   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "I"
   )
   private int field1298;
   @OriginalMember(
      owner = "client!al",
      name = "s",
      descriptor = "I"
   )
   public static int field1299;
   @OriginalMember(
      owner = "client!al",
      name = "p",
      descriptor = "I"
   )
   public static int field1302;
   @OriginalMember(
      owner = "client!al",
      name = "q",
      descriptor = "I"
   )
   public static int field1307;
   @OriginalMember(
      owner = "client!al",
      name = "e",
      descriptor = "I"
   )
   public static int field1308;
   @OriginalMember(
      owner = "client!al",
      name = "k",
      descriptor = "I"
   )
   public static int field1309;
   @OriginalMember(
      owner = "client!al",
      name = "n",
      descriptor = "I"
   )
   public static int field1310;
   @OriginalMember(
      owner = "client!al",
      name = "m",
      descriptor = "I"
   )
   public static int field1311;
   @OriginalMember(
      owner = "client!al",
      name = "d",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field1295;

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(Ljaggl/MapBuffer;I)Z",
      line = 8
   )
   public final boolean method921(MapBuffer arg0, int arg1) {
      try {
         ++field1309;
         boolean var3 = true;
         if (this.field1301 != arg1) {
            if (this.field1303 > 0) {
               label35: {
                  OpenGL.glBindBufferARB(this.field1305, this.field1303);
                  if (this.field1301 == 1) {
                     OpenGL.glBufferSubDataARBa(this.field1305, 0, this.field1298, this.field1304.field4973.getAddress());
                     if (client.field4530 == 0) {
                        break label35;
                     }
                  }

                  var3 = arg0.method4694();
               }
            }

            this.field1301 = 0;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1312[9] + (arg0 != null ? field1312[3] : field1312[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "f",
      descriptor = "(I)V",
      line = 35
   )
   public final void method922(int arg0) {
      try {
         ++field1299;
         if (arg0 != -30749) {
            this.method926((byte)119);
         }

         if (this.field1304.field5833) {
            OpenGL.glBindBufferARB(this.field1305, this.field1303);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1312[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(BI)V",
      line = 50
   )
   public void method923(byte arg0, int arg1) {
      try {
         if (arg0 != 77) {
            field1306 = false;
         }

         if (~this.field1298 > ~arg1) {
            label35: {
               this.method925(arg0 + -170);
               if (~this.field1303 >= -1) {
                  this.field1295 = this.field1304.method2673((byte)126, false, arg1);
                  if (client.field4530 == 0) {
                     break label35;
                  }
               }

               OpenGL.glBindBufferARB(this.field1305, this.field1303);
               OpenGL.glBufferDataARBub(this.field1305, arg1, (byte[])null, 0, this.field1300 ? 35040 : 35044);
               this.field1304.field4996 += -this.field1298 + arg1;
            }

            this.field1298 = arg1;
         }

         ++field1311;
         this.field1297 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1312[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "<init>",
      descriptor = "(Leh;IZ)V",
      line = 198
   )
   public class107(class379 arg0, int arg1, boolean arg2) {
      try {
         this.field1304 = arg0;
         this.field1300 = arg2;
         this.field1305 = arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1312[5] + (arg0 != null ? field1312[3] : field1312[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(ZLjaggl/MapBuffer;I)Ljaclib/memory/Buffer;",
      line = 86
   )
   public final Buffer method924(boolean arg0, MapBuffer arg1, int arg2) {
      try {
         ++field1307;
         if (arg2 > -45) {
            return null;
         } else {
            if (this.field1301 == 0) {
               this.method925(-84);
               if (~this.field1303 >= -1) {
                  this.field1301 = 2;
                  return this.field1295;
               }

               OpenGL.glBindBufferARB(this.field1305, this.field1303);
               if (arg0) {
                  OpenGL.glBufferDataARBub(this.field1305, this.field1298, (byte[])null, 0, !this.field1300 ? 35044 : 35040);
                  if (this.field1297 <= this.field1304.field4973.field10505) {
                     this.field1301 = 1;
                     return this.field1304.field4973;
                  }
               }

               if (!arg1.method4696() && arg1.method4695(this.field1305, this.field1297, 35001)) {
                  this.field1301 = 2;
                  return arg1;
               }
            }

            return null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1312[12] + arg0 + ',' + (arg1 != null ? field1312[3] : field1312[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "e",
      descriptor = "(I)V",
      line = 131
   )
   private final void method925(int arg0) {
      try {
         ++field1308;
         if (arg0 < -2) {
            if (this.field1303 < 0) {
               if (this.field1304.field5833) {
                  OpenGL.glGenBuffersARB(1, class69.field869, 0);
                  this.field1303 = class69.field869[0];
                  OpenGL.glBindBufferARB(this.field1305, this.field1303);
               } else {
                  this.field1303 = 0;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1312[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "b",
      descriptor = "(B)J",
      line = 156
   )
   public final long method926(byte arg0) {
      try {
         ++field1302;
         if (arg0 != -32) {
            return -65L;
         } else {
            return this.field1303 != 0 ? 0L : this.field1295.getAddress();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1312[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "b",
      descriptor = "(I)I",
      line = 172
   )
   public int method927(int arg0) {
      try {
         if (arg0 != 34962) {
            this.method923((byte)61, -128);
         }

         ++field1310;
         return this.field1297;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1312[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "finalize",
      descriptor = "()V",
      line = 185
   )
   protected final void finalize() throws Throwable {
      try {
         ++field1294;
         this.method423(-15607);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1312[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(I)V",
      line = 209
   )
   public void method423(int arg0) {
      try {
         if (~this.field1303 < -1) {
            this.field1304.method2933(this.field1297, this.field1303, true);
            this.field1303 = -1;
         }

         ++field1293;
         if (arg0 != -15607) {
            this.method926((byte)62);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1312[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(ILjaclib/memory/Source;I)Z",
      line = 226
   )
   public final boolean method928(int arg0, Source arg1, int arg2) {
      try {
         ++field1296;
         if (arg0 != 0) {
            this.method423(98);
         }

         label44: {
            if (this.field1298 >= arg2) {
               if (this.field1303 <= 0) {
                  throw new RuntimeException(field1312[1]);
               }

               OpenGL.glBindBufferARB(this.field1305, this.field1303);
               OpenGL.glBufferSubDataARBa(this.field1305, 0, this.field1297, arg1.getAddress());
               this.field1304.field4996 += -this.field1297 + arg2;
               if (client.field4530 == 0) {
                  break label44;
               }
            }

            this.method925(-116);
            if (this.field1303 <= 0) {
               throw new RuntimeException(field1312[1]);
            }

            OpenGL.glBindBufferARB(this.field1305, this.field1303);
            OpenGL.glBufferDataARBa(this.field1305, arg2, arg1.getAddress(), this.field1300 ? 35040 : 35044);
            this.field1304.field4996 += arg2 - this.field1297;
            this.field1298 = arg2;
         }

         this.field1297 = arg2;
         return true;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1312[4] + arg0 + ',' + (arg1 != null ? field1312[3] : field1312[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method929(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method930(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

package deob;

@ObfuscatedName("VMBJKBNJ")
public class VMBJKBNJ extends UCIRENXU {

	@ObfuscatedName("VMBJKBNJ.r")
	public static int field1284;

	@ObfuscatedName("VMBJKBNJ.s")
	public static int field1285;

	@ObfuscatedName("VMBJKBNJ.t")
	public static int field1286;

	@ObfuscatedName("VMBJKBNJ.u")
	public static int field1287;

	@ObfuscatedName("VMBJKBNJ.v")
	public static int field1288;

	@ObfuscatedName("VMBJKBNJ.w")
	public static int field1289;

	@ObfuscatedName("VMBJKBNJ.x")
	public static int field1290;

	@ObfuscatedName("VMBJKBNJ.y")
	public static int field1291;

	@ObfuscatedName("VMBJKBNJ.z")
	public static int field1292;

	@ObfuscatedName("VMBJKBNJ.q")
	public static int[] field1283;

	@ObfuscatedName("VMBJKBNJ.a(III[I)V")
	public static void method542(int arg0, int arg1, int[] arg2) {
		field1283 = arg2;
		field1284 = arg1;
		field1285 = arg0;
		method544(0, arg1, 0, arg0);
	}

	@ObfuscatedName("VMBJKBNJ.a(B)V")
	public static void method543() {
		field1288 = 0;
		field1286 = 0;
		field1289 = field1284;
		field1287 = field1285;
		field1290 = field1289 - 1;
		field1291 = field1289 / 2;
	}

	@ObfuscatedName("VMBJKBNJ.a(IIIII)V")
	public static void method544(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 > field1284) {
			arg1 = field1284;
		}

		if (arg3 > field1285) {
			arg3 = field1285;
		}

		field1288 = arg2;
		field1286 = arg0;
		field1289 = arg1;
		field1287 = arg3;
		field1290 = field1289 - 1;
		field1291 = field1289 / 2;
		field1292 = field1287 / 2;
	}

	@ObfuscatedName("VMBJKBNJ.a(I)V")
	public static void method545() {
		int var0 = field1285 * field1284;
		for (int var1 = 0; var1 < var0; var1++) {
			field1283[var1] = 0;
		}
	}

	@ObfuscatedName("VMBJKBNJ.a(IIIIIZI)V")
	public static void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field1288) {
			arg5 -= field1288 - arg3;
			arg3 = field1288;
		}

		if (arg0 < field1286) {
			arg2 -= field1286 - arg0;
			arg0 = field1286;
		}

		if (arg3 + arg5 > field1289) {
			arg5 = field1289 - arg3;
		}

		if (arg0 + arg2 > field1287) {
			arg2 = field1287 - arg0;
		}

		int var6 = 256 - arg1;
		int var7 = (arg4 >> 16 & 0xFF) * arg1;
		int var8 = (arg4 >> 8 & 0xFF) * arg1;
		int var9 = (arg4 & 0xFF) * arg1;
		int var10 = field1284 - arg5;
		int var11 = field1284 * arg0 + arg3;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = (field1283[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1283[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1283[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1283[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("VMBJKBNJ.a(IIIIII)V")
	public static void method547(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field1288) {
			arg0 -= field1288 - arg1;
			arg1 = field1288;
		}

		if (arg3 < field1286) {
			arg2 -= field1286 - arg3;
			arg3 = field1286;
		}

		if (arg0 + arg1 > field1289) {
			arg0 = field1289 - arg1;
		}

		if (arg2 + arg3 > field1287) {
			arg2 = field1287 - arg3;
		}

		int var5 = field1284 - arg0;
		int var6 = field1284 * arg3 + arg1;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field1283[var6++] = arg4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("VMBJKBNJ.b(IIIIII)V")
	public static void method548(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method550(arg2, arg4, arg0, arg1);
		method550(arg2, arg3 + arg4 - 1, arg0, arg1);
		method552(arg0, arg4, arg2, arg3);
		method552(arg0 + arg1 - 1, arg4, arg2, arg3);
	}

	@ObfuscatedName("VMBJKBNJ.a(IIIIIII)V")
	public static void method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method551(arg2, arg1, arg3, arg0, arg4);
		method551(arg2 + arg5 - 1, arg1, arg3, arg0, arg4);

		if (arg5 >= 3) {
			method553(arg2 + 1, arg3, arg5 - 2, arg4, arg0);
			method553(arg2 + 1, arg1 + arg3 - 1, arg5 - 2, arg4, arg0);
		}
	}

	@ObfuscatedName("VMBJKBNJ.b(IIIII)V")
	public static void method550(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field1286 && arg1 < field1287) {
			if (arg2 < field1288) {
				arg3 -= field1288 - arg2;
				arg2 = field1288;
			}

			if (arg2 + arg3 > field1289) {
				arg3 = field1289 - arg2;
			}

			int var4 = field1284 * arg1 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field1283[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("VMBJKBNJ.c(IIIIII)V")
	public static void method551(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field1286 && arg0 < field1287) {
			if (arg2 < field1288) {
				arg1 -= field1288 - arg2;
				arg2 = field1288;
			}

			if (arg1 + arg2 > field1289) {
				arg1 = field1289 - arg2;
			}

			int var5 = 256 - arg3;
			int var6 = (arg4 >> 16 & 0xFF) * arg3;
			int var7 = (arg4 >> 8 & 0xFF) * arg3;
			int var8 = (arg4 & 0xFF) * arg3;
			int var9 = field1284 * arg0 + arg2;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field1283[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1283[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1283[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1283[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("VMBJKBNJ.c(IIIII)V")
	public static void method552(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field1288 && arg0 < field1289) {
			if (arg1 < field1286) {
				arg3 -= field1286 - arg1;
				arg1 = field1286;
			}

			if (arg1 + arg3 > field1287) {
				arg3 = field1287 - arg1;
			}

			int var4 = field1284 * arg1 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field1283[field1284 * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("VMBJKBNJ.a(IIBIII)V")
	public static void method553(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field1288 && arg1 < field1289) {
			if (arg0 < field1286) {
				arg2 -= field1286 - arg0;
				arg0 = field1286;
			}

			if (arg0 + arg2 > field1287) {
				arg2 = field1287 - arg0;
			}

			int var5 = 256 - arg4;
			int var6 = (arg3 >> 16 & 0xFF) * arg4;
			int var7 = (arg3 >> 8 & 0xFF) * arg4;
			int var8 = (arg3 & 0xFF) * arg4;
			int var9 = field1284 * arg0 + arg1;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field1283[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1283[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1283[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1283[var9] = var14;
				var9 += field1284;
			}
		}
	}
}
